package dz;

public class ArrayValueCalculator {
    public static int doCalc(String[][] inputArray)
            throws
            ArraySizeException,
            ArrayDataException {
        if (inputArray.length != 4 || inputArray[0].length != 4) {
            throw new ArraySizeException("Wrong size array");
        }

        int sum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                try {
                    int value = Integer.parseInt(inputArray[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid integer value at cell [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
