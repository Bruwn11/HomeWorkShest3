package HomeWorkShestakov;

import java.util.Arrays;

public class HomeWorkLesson27_28 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        completionArrays(array);
        writeArrays(array);
        sumElementsOfString(array);
        sumElementsOfColumns(array);
        String[] arrays = {"Я", "люблю", "кушать", "жаренную", "картошку", "с", "грибами"};
        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.toString(copyOfRange(2, 10, arrays)));
        String[] strings = {"Я", "люблю", "кушать", "жаренную", "картошку", "с", "грибами"};
        String s = "привет";
        System.out.println(Arrays.toString(strings));
        fillArrays(s, strings);
        System.out.println(Arrays.toString(strings));
    }

    /**Заполняет массив числами в зависимости от колличества строк и столбцов.
     *Заполнение массива начинается с единицы, каждый новый элемент массива увеличивается на +1.
     * @param array Целочисленный двумерный массив.
     */
    public static void completionArrays(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (1 + j) + (array[i].length * i);
            }
        }
    }

    /**
     * Выводит массив в виде матрицы на экран.
     * @param array Целочичленный двумерный массив.
     */
    public static void writeArrays(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Находит сумму элементов в каждой строке и выводит её.
     * @param array Целочисленный двумерный массив.
     */
    public static void sumElementsOfString(int[][] array) {
        int[] sumElements = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumElements[i] += array[i][j];
            }
            System.out.println("Сумма строки номер " + (i + 1) + " равна " + sumElements[i]);
        }
    }

    /**
     * Находит сумму элементов в каждом столбце и выводит её.
     * @param array Целочисленный двумерный массив.
     */
    public static void sumElementsOfColumns(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            int sumColumns = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumColumns += array[j][i];
            }
            System.out.println("Сумма столбца номер " + (i + 1) + " равна " + sumColumns);
        }
    }

    /**
     * Копирует строковый массив от элемента a до элемента b.
     * Элемент b, по традициям java в копировании не участвет.
     * @param a Элемент с которого начинается копирование включительно.
     * @param b Элемент, на котором заканчивается копирование невключительно.
     * @param array Строковый массив для копирования.
     * @return Строковый массив, скопироанный по указанным индексам элементов a и b.
     */
    public static String[] copyOfRange(int a, int b, String[] array) {
        if (b > array.length) {
            b = array.length + 1;
        }
        if (a <= 0) {
            a = 1;
        }
        int l = b - a;
        String[] copyArrayOfRange = new String[l];
        for (int i = 0; i < l; i++) {
            copyArrayOfRange[i] = array[a - 1 + i];
        }
        return copyArrayOfRange;
    }

    /**
     * Заполняет строковый массив строкой, переданной в параметр метода.
     * @param s Строка, переданная в параметр метода, которая копируется во все элементы массива.
     * @param array Строковый массив.
     */
    public static void fillArrays(String s, String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = s;
        }
    }
}
