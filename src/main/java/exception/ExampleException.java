package exception;

public class ExampleException {
    public static void main(String[] args) {
        try {
            throwCustomException(false);
        } catch (CustomException e) {
            System.err.println("Не поймал!");
        }

        try {
            throwCustomException(true);
        } catch (CustomException e) {
            System.err.println("Поймал!");
        }
    }
    public static void throwCustomException(boolean flag) throws CustomException {
        if (flag) {
            throw new CustomException("Ну мед! Ну медятина!");
        }
        System.out.println("Все ОК!");
    }
}
