public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "Является високосным");
        } else {
            System.out.println(year + "Не является високосным");
        }

    }
}