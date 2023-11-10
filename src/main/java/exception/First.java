package exception;

public class First {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.err.println("Нельзя делить на ноль!");
        }

        try {
            accessToUnexistingElement();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Нельзя обращаться к элементу за пределами массива!");
        }

        try {
            playWithNullPointer();
        } catch (NullPointerException e) {
            System.err.println("Нельзя делать всякое с null'ом!");
        }
        try {
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException e) {
            System.err.println("Нельзя создать массив отрицательной длины!");
        }

        try {
            searchSomethingOutString();
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Нельзя искать символы за пределами строки!");
        }
        System.out.println("Ура! Меня снова печатают");
    }


    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement(){
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length+1; i++) {
            // Тут было обращение просто к индексу i и исключения не было)
            // System.out.printf("%d,", i);
            // Исправил, чтобы было как положено)
            System.out.printf("%d,", arr[i]);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        // Тут тоже не было исключения, скорее всего из-за того, что у меня JDK 21
        // Видимо тут Java научилась сама кастовать null к строке)
        // System.out.println("important is " + importantData);
        // Исправил, чтобы было как положено)
        System.out.println("important length is " + importantData.length());
    }

    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }

}
