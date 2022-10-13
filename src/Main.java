public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        // Задание 2
        System.out.println("Задание 2");
        {
            int salary2 = 29000;
            int total2 = 0;
            for (int i = 1; i <= 12; i++) {
                total2 = total2 + total2 / 100;
                total2 = total2 + salary2;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей.");
            }
        }
    }
}