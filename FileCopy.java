import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        File sourceFile = new File("source.txt");
        File destinationFile = new File("destination.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Файл успешно скопирован.");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка: проблема при чтении или записи файла.");
        }
    }
}