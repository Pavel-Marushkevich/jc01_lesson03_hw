package linear_progs;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга (R): ");
        double R = scanner.nextDouble();

        // Вычисление длины окружности
        double P = 2 * Math.PI * R;

        // Вычисление площади круга
        double S = Math.PI * Math.pow(R, 2);

        // Вывод результатов
        System.out.println("Длина окружности: " + P);
        System.out.println("Площадь круга: " + S);

        scanner.close();
    }
}
