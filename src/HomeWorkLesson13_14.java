import java.util.Scanner;

public class HomeWorkLesson13_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста введите целое число.");
        int number1 = scan.nextInt();
        task1(number1);
        System.out.println("Пожалуйста, введите ещё одно целое число.");
        int number2 = scan.nextInt();
        task2(number2);
        task3();
    }

    public static void task1(int number1) {
        for (int i = 1; i <= number1; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task2(int number2) {
        int factorial = 1;
        for (int i = 1; i <= number2; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void task3() {
        System.out.println("Таблица умножения от 1 до 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            for (int j = 1; j < 10; j++) {
                int composition = i * (j + 1);
                System.out.print(composition + " ");
            }
            System.out.println();

        }

    }
}