import dz.ArrayDataException;
import dz.ArraySizeException;

import static dz.ArrayValueCalculator.doCalc;

public class Main {
    public static void main(String[] args) {
            try {
                String[][] original = {
                        {"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}
                };

                int result = doCalc(original);
                System.out.println("Sum: " + result);

                String[][] test = {
                        {"1", "arara", "3"},
                        {"4", "5.5", "6"},
                        {"7", "9"},
                        {"7", "9"},
                        {"7", "9"},
                        {"7", "9"},
                };
                int testResult = doCalc(test);

            } catch (ArraySizeException e) {
                System.err.println(e.getMessage());
            } catch (ArrayDataException e) {
                System.err.println(e.getMessage());
            }
        }
    }