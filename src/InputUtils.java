import java.util.Scanner;

public class InputUtils {
    public static float getFloatInput() throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите дробное число: ");
            String inputStr = scanner.nextLine();
            if (inputStr.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            }
            try {
                float input = Float.parseFloat(inputStr);
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода! Попробуйте еще раз.");
            }
        }
    }
}
