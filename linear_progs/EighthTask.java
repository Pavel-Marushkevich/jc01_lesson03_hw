package linear_progs;

import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину ребра куба (a): ");
        double a = scanner.nextDouble();

        // Вычисление площади грани
        double s = Math.pow(a, 2);

        // Вычисление полной площади поверхности
        double S = 6 * s;

        // Вычисление объема куба
        double V = Math.pow(a, 3);

        // Вывод результатов
        System.out.println("Площадь одной грани: " + s);
        System.out.println("Площадь полной поверхности: " + S);
        System.out.println("Объем куба: " + V);

        scanner.close();
    }
}
