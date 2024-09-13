import java.util.Scanner;

/* Задание: Реализовать в коде алгоритм, на основе задания-алгоритма.
  "Программа, которая подсказывает, что нужно одеть в соответствии с прогнозом погоды"
   temperature<=2:надеть тёплую куртку и тёплые штаны
   2>temperature<=16:надеть куртку и штаны, temperature>16:надеть футболку и шорты,.
       */
public class HomeWorkLesson9_10 {
    public static void main(String[] args) {
        Scanner weather = new Scanner(System.in);
        String message;
        System.out.println("Ведите пожалуйста значение температуры целое число");
        int temperature = weather.nextByte();
        if (temperature <= 2) {
            message = "Наденьте тёплую куртку и тёплые штаны.";
        } else if (temperature <= 16) {
            message = "Наденьте лёгкую куртку и лёгкие штаны.";
        } else {
            message = "Наденьте футболку и шорты.";
        }
        System.out.println(message);
    }
}