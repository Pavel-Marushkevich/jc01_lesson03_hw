package linear_progs;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        // Среднее арифметическое кубов
        double A = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;

        // Среднее геометрическое модулей чисел
        double G = Math.sqrt(Math.abs(a) * Math.abs(b));

        System.out.println("Среднее арифметическое кубов: " + A);
        System.out.println("Среднее геометрическое модулей: " + G);

        scanner.close();
    }
}
