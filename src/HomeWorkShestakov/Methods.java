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
        int[] intArray = {1, 3, 5, 2, 6, -3};
        System.out.println(Arrays.toString(cornerValuesArray(intArray)));
        char[] charArray = {'a','f', 'A', 't'};
        System.out.println(Arrays.toString(cornerValuesArray(charArray)));
    }

    /**
     * Возвращает квадрат переданного целого чмсла
     * @param a целое число
     * @return возвращает квадрат переданного целого числа
     */
    public static int square(int a) {
        return a * a;
    }

    /**
     * Принимает две переменных типа String, имя и фамилию, и выводыит в консоль полное имя
     * @param name переменная String имя
     * @param surname переменная String фамилия
     */
    public static void printFullName(String name, String surname) {
        System.out.println("Full name: " + name + " " + surname);
    }

    /**
     * Находит из переменных типа String самую маленькую и самую большую строку.
     * @param array varargs с переменными типа String.
     * @return возвращает массив с наименьшей и наибольшей строками.
     */
    public static String[] cornerValuesArray(String... array) {
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

    /**
     * Находит из переменных типа int самый маленький и самый большой элемент.
     * @param array varargs с переменными типа int.
     * @return возвращает массив с наименьшим и наибольшим элементами.
     */
    public static int[] cornerValuesArray(int... array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        return new int[]{min, max};
    }

    /**
     * Находит из переменных типа char самый маленький и самый большой элемент
     * @param array varargs с переменными типа char.
     * @return возвращает массив с наименьшим и наибольшим элементами.
     */
    public static char[] cornerValuesArray(char... array) {
        int min = array[0];
        int max = array[0];
        char charMin = array[0];
        char charMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                charMin = array[i];
            }
            if (max < array[i]) {
                max = array[i];
                charMax = array[i];
            }
        }
        return new char[]{charMin, charMax};
    }
}
