package lesson2;

public class MyArrayDataException extends Exception {

    private int x;
    private int y;

    public MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printMessage() {
        System.out.println("Ошибка! В ячейке " + x + "|" + y + " неверные данные!");
    }
}
