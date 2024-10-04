package HomeWorkShestakov;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше целое число.");
        int square = scan.nextInt();
        System.out.println("Квадрат вашего целого числа равен " + square(square));
        System.out.println("Пожалуйста введите ваше имя.");
        String name = scan.nextLine();
        name = scan.nextLine();
        System.out.println("Введите пожалуйста вашу фамилию.");
        String surname = scan.nextLine();
        printFullName(name, surname);
        String[] array = {"Вася", "привет", "как", "жизнь молодая?" };
        System.out.println(Arrays.toString(cornerValuesArray(array)));
    }

    public static int square(int a) {
        return a * a;
    }

    public static void printFullName(String name, String surname) {
        System.out.println("Full name: " + name + " " + surname);
    }

    public static String[] cornerValuesArray(String[] array) {
        int min = array[0].length();
        int max = array[0].length();
        String sMin = "";
        String sMax = "";
        for (int i = 1; i < array.length; i++) {
            if (min > array[i].length()) {
                min = array[i].length();
                sMin = array[i];
            }
            if (max < array[i].length()) {
                max = array[i].length();
                sMax = array[i];
            }
        }
        return new String[]{sMin, sMax};
    }
}
