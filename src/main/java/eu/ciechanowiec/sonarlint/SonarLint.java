package eu.ciechanowiec.sonarlint;

import org.tinylog.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 * @author Herman Ciechanowiec
 */
class SonarLint {

    public static void main(String[] args) {
        /* * * * * * * * * * * * * * * * * * * *
         * DO NOT CHANGE ANYTHING IN THIS MAIN *
         * * * * * * * * * * * * * * * * * * * * /

        /* TASK 1 */
        System.out.println("TASK 1");
        printPoem();

        /* TASK 2 */
        System.out.println("\nTASK 2");
        try {
            int result = doUnsafeDivision(10, 0);
            System.out.printf("The result of unsafe division: %d%n", result);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("The program successfully restored after making illegal division.");
        }

        /* TASK 3 */
        System.out.println("\nTASK 3");
        List<String> listOfStrings = List.of("A", "C", "A", "D", "E", "M", "Y");
        String connectedString = mergeIntoSingleString(listOfStrings);
        System.out.printf("Connected string: %s%n", connectedString);
    }

    /* Correct the body of this method so that after the correction:
     * - there is no bug 'java:S2095'
     * - there is no code smell 'java:S2093'
     * - there is no bug 'java:S2259' */
    private static void printPoem() {
        File file = new File("./src/main/resources/poem.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException exception) {
            Logger.error(exception);
        }
    }

    /* Correct the body of this method so that after the
     * correction there is no code smell 'java:S1181' */
    private static int doUnsafeDivision(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (Throwable exception) {
            Logger.error(exception);
            throw exception;
        }
    }

    /* Correct the body of this method so that after the
     * correction there is no code smell 'java:S1643' */
    private static String mergeIntoSingleString(List<String> listOfStrings) {
        String result = "";
        for (String string : listOfStrings) {
            result += string;
        }
        return result;
    }
}		
