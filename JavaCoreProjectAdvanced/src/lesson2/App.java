package lesson2;


public class App {
    public static void main(String[] args) {
        String[][] strings = new String[4][4];
        fillArr(strings);
        strings[1][2] = "not a number";

        try {
            System.out.println(sumStringArray(strings));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printMessage();
        }

    }

    public static int sumStringArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        boolean isArrCorrect = true;
        if (arr.length != 4) isArrCorrect = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) isArrCorrect = false;
        }
        if (!isArrCorrect) throw new MyArraySizeException();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value;
                try {
                    value = Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
                sum += value;
            }
        }
        return sum;
    }

    public static void fillArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = "1";
            }
        }
    }
}
