import com.epam.dmytro_barsuk.java.task6_generics.task1.TextAnalyzer;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        startTextAnalyzer();
    }

     static void startTextAnalyzer() throws FileNotFoundException {
        String escape = "y";
        while (!escape.equals("n")) {
            System.out.println("Input file path: ");
            TextAnalyzer analyzer = new TextAnalyzer(TextAnalyzer.readConsole.next());
            System.out.println("Choose function: 1.Frequency 2.Length 3.Duplicates");
            int choice = TextAnalyzer.readConsole.nextInt();
            switch (choice) {
                case 1:
                    analyzer.frequency();
                    System.out.println("Press Y to continue or N to abort");
                    escape = TextAnalyzer.readConsole.next();
                    break;
                case 2:
                    analyzer.length();
                    System.out.println("Press Y to continue or N to abort");
                    escape = TextAnalyzer.readConsole.next();
                    break;
                case 3:
                    try{
                    analyzer.duplicates();
                    System.out.println("Press Y to continue or N to abort");
                    escape = TextAnalyzer.readConsole.next();
                    }catch (NullPointerException e){
                        System.out.println("Words aren't duplicated.");
                        escape="y";
                    }
                    break;
                default:
                    System.out.println("Wrong choice!");
                    System.out.println("Press Y to continue or N to abort");
                    escape = TextAnalyzer.readConsole.next();
                    break;
            }

        }
    }
}