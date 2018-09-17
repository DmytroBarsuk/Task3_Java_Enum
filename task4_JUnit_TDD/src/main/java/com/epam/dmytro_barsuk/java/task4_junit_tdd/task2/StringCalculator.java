package com.epam.dmytro_barsuk.java.task4_junit_tdd.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public void add() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String regex = "(,?\\d,?)";

        // Создание Pattern объекта
        Pattern r = Pattern.compile(regex);

        // Создание matcher объекта
        Matcher m = r.matcher(str);
        while(m.find()){
            System.out.println(str.substring(m.start(), m.end()));
        }

    }
}
