package linear_progs;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод координат вершин треугольника
        System.out.print("Введите координату x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите координату y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Введите координату x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите координату y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("Введите координату x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Введите координату y3: ");
        double y3 = scanner.nextDouble();

        // Вычисление длин сторон
        double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double CA = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Вычисление периметра
        double S = AB + BC + CA;

        // Полупериметр
        double s = S / 2;

        // Вычисление площади
        double area = Math.sqrt(s * (s - AB) * (s - BC) * (s - CA));

        // Вывод результатов
        System.out.println("Периметр треугольника: " + S);
        System.out.println("Площадь треугольника: " + area);

        scanner.close();
    }
}
