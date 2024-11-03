import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DivisionCalculator {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Результат: " + result);
        } catch (CustomDivisionException e) {
            System.out.println("Ошибка: " + e.getMessage());
            logException(e);
        }
    }

    public static int divide(int a, int b) throws CustomDivisionException {
        if (b == 0) {
            throw new CustomDivisionException("Деление на ноль невозможно.");
        }
        return a / b;
    }

    public static void logException(Exception e) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("exceptions.log", true))) {
            writer.println("Исключение: " + e.toString());
        } catch (IOException ioException) {
            System.out.println("Ошибка при записи в лог-файл.");
        }
    }
}
