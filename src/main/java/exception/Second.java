package exception;

import java.util.Arrays;

public class Second {

    public static void main(String[] args) {
        onlyPositive(1);
        try {
            onlyPositive(-1);
        } catch (NumberFormatException e) {
            System.err.println("Недопустимый аргумент!");
        }

        arrayLength(new int[]{1, 2});
        try {
            arrayLength(new int[]{1, 2, 3, 4});
        } catch (IllegalArgumentException e) {
            System.err.println("Недопустимая длина массива!");
        }

        nullPointer(new String[]{"Hello", "World", "!"});
        try {
            nullPointer(null);
        } catch (NullPointerException e) {
            System.err.println("Недопустимый массив!");
        }
    }

    public static void onlyPositive(int arg) {
        if (arg < 0) {
            throw new NumberFormatException("Аргмуент должен быть не меньше нуля!");
        }

        System.out.println(arg + " >= 0");
    }

    public static void arrayLength(int[] arr) {
        if (arr.length != 2) {
            throw new IllegalArgumentException("Длина входного массива должна быть равна 2!");
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void nullPointer(String[] arr) {
        if (arr == null) {
            throw new NullPointerException("Массив равен null!");
        }

        System.out.println(Arrays.toString(arr));
    }
}
