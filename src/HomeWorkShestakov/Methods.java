package HomeWorkShestakov;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String[] string1 = {};
        System.out.println(Arrays.toString(cornerValuesArray(string1)));
        String[] string2 = {"AAA", "AAA", "AAA"};
        System.out.println(Arrays.toString(cornerValuesArray(string2)));
        String[] string3 = {"Hello", "world", "!"};
        System.out.println(Arrays.toString(cornerValuesArray(string3)));
        int[] int1 = {};
        System.out.println(Arrays.toString(cornerValuesArray(int1)));
        int[] int2 = {6, 6, 6, 6, 6};
        System.out.println(Arrays.toString(cornerValuesArray(int2)));
        int[] int3 = {6, 1, 0, 6, -7};
        System.out.println(Arrays.toString(cornerValuesArray(int3)));
        char[] char1 = {};
        System.out.println(Arrays.toString(cornerValuesArray(char1)));
        char[] char2 = {'o', 'o', 'o', 'o'};
        System.out.println(Arrays.toString(cornerValuesArray(char2)));
        char[] char3 = {'0', 'i', '9', 'y'};
        System.out.println(Arrays.toString(cornerValuesArray(char3)));
        System.out.println(factorial(-3));
        System.out.println(factorial(5));
        System.out.println(factorial(0));
        System.out.println(factorial(1));
    }

    /**
     * Находит из переменных типа String самую маленькую и самую большую строку.
     *
     * @param array varargs с переменными типа String.
     * @return возвращает массив с наименьшей и наибольшей строками.
     */
    public static String[] cornerValuesArray(String... array) {
        if (array.length == 0) {
            return new String[]{null, null};
        }
        int min = array[0].length();
        int max = array[0].length();
        String sMin = array[0];
        String sMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i].length()) {
                min = array[i].length();
                sMin = array[i];
            } else if (max < array[i].length()) {
                max = array[i].length();
                sMax = array[i];
            }
        }
        return new String[]{sMin, sMax};
    }

    /**
     * Находит из переменных типа int самый маленький и самый большой элемент.
     *
     * @param array varargs с переменными типа int.
     * @return возвращает массив с наименьшим и наибольшим элементами.
     */
    public static int[] cornerValuesArray(int... array) {
        if (array.length == 0) {
            return new int[]{0, 0};
        }
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
     *
     * @param array varargs с переменными типа char.
     * @return возвращает массив с наименьшим и наибольшим элементами.
     */
    public static char[] cornerValuesArray(char... array) {
        if (array.length == 0) {
            return new char[]{'0', '0'};
        }
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

    /**
     * Находит факториал заданного числа
     * @param n любое целое число, факториал которого мы ищем
     * @return возвращает факториал целого числа
     */
    public static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        if (n < 0) {
            result = n * factorial(n + 1);
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}
