package com.epam.dmytro_barsuk.java.task6_generics.task1;

import lombok.Getter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAnalyzer {
    @Getter
    private String filePath;
    private Scanner readFile;
    public static final Scanner readConsole = new Scanner(System.in);
    private Map<String, Integer> wordsWithCount = new HashMap<>();

    public TextAnalyzer(String filePath) throws FileNotFoundException {
        this.filePath = filePath;
        readFile = new Scanner(new FileReader(this.filePath));
    }


    public void frequency() {
        addAllWordsFromFile();
        //  printWordsWithCount();
        System.out.println("The most common words:");
        wordsWithCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(2)
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey() + "->" + e.getValue()));
    }

    public void length() {
        addAllWordsFromFile();
        String[] words = new String[wordsWithCount.keySet().size()];
        wordsWithCount.keySet().toArray(words);
        bubbleSort(words, false);
        System.out.println("Three longest words in file:");
        for (int i = 0; i < 3; i++)
            System.out.printf("%s -> %d \n", words[i], words[i].length());
    }

    public void duplicates() {
        addAllWordsFromFile();
        StringBuilder[] duplicates = new StringBuilder[3];

        int count = 0;
        for (Map.Entry<String, Integer> item : wordsWithCount.entrySet()) {
            if (item.getValue() > 1) {
                if (count == 3) {
                    break;
                } else {
                    duplicates[count] = new StringBuilder(item.getKey().toUpperCase());
                    count++;
                }
            }
        }
        bubbleSort(duplicates, true);

        System.out.println("Duplicates: ");
        for (StringBuilder item : duplicates) {
            System.out.println(item.reverse());
        }
    }

    private void addAllWordsFromFile() {
        if (wordsWithCount.isEmpty()) {
            while (readFile.hasNext()) {
                String word = readFile.next();
                word = word.split("\\s*(\\s|,|!|\\.)\\s*")[0].toLowerCase();
                if (!wordsWithCount.containsKey(word)) {
                    wordsWithCount.put(word, 1);
                } else {
                    wordsWithCount.put(word, wordsWithCount.get(word) + 1);
                }
            }
        } else {
            return;
        }
    }

    private <T extends CharSequence> void bubbleSort(T[] array, boolean desc) {
        if (array.length > 2) {
            T temp;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    boolean req = desc ? (array[j].length() > array[j + 1].length()) : (array[j].length() < array[j + 1].length());
                    if (req) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        else{
            return;
        }
    }
}
