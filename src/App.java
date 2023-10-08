public class App {
    public static void main(String[] args) {
        try {
            float number = InputUtils.getFloatInput();
            System.out.println("Вы ввели число: " + number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
