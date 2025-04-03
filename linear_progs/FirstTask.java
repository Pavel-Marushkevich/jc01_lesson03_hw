package linear_progs;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину катета a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите длину катета b: ");
        double b = scanner.nextDouble();

        // Вычисление гипотенузы
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Вычисление периметра
        double P = a + b + c;

        // Вычисление площади
        double S = (a * b) / 2;

        // Вывод результатов
        System.out.println("Гипотенуза: " + c);
        System.out.println("Периметр: " + P);
        System.out.println("Площадь: " + S);

        scanner.close();
    }
}
