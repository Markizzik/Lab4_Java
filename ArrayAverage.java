public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        double average = 0.0;

        try {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            average = (double) sum / arr.length;
            System.out.println("Среднее арифметическое: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива.");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверные данные, элемент массива не является числом.");
        }
    }
}
