
import java.util.Scanner;

public class HomeWorkLesson17_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста, введите вашу строку.");
        String str = scan.nextLine().toLowerCase();
        task1(str);
        task2(str);
        System.out.println("Пожалуйста, введите ваше целое число.");
        int task3 = scan.nextInt();
        task3(task3);
    }

    public static void task1(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean isPalindrome = str.contentEquals(sb.reverse());
        String answer = isPalindrome ? str + " это палиндром" : str + " это не палиндром";
        System.out.println(answer);
    }

    public static void task2(String str) {
        boolean isPalindrome = true;
        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        String answer = isPalindrome ? str + " это палиндром" : str + " это не палиндром";
        System.out.println(answer);
    }

    public static void task3(int t) {
        boolean isPalindrome = true;
        int count = 0;
        for (int i = t; i != 0; i /= 10) {
            count++;
        }
        for (int i = t; i != 0; i /= 10) {
            int indexEnd = (i % 10);      //последняя цифра
            int x = t / (int) Math.pow(10, (count - 1));
            int indexBegin = x % 10;      //первая цифра
            if (indexBegin != indexEnd) {
                isPalindrome = false;
            }
            count--;   //уменьшение порякда деления
        }
        String answer = isPalindrome ? t + " это палиндром" : t + " это не палиндром";
        System.out.println(answer);
    }
}