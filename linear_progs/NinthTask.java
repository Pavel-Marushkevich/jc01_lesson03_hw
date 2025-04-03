package linear_progs;
import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину стороны треугольника (a): ");
        double a = scanner.nextDouble();

        // Вычисления
        double S = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        double h = (Math.sqrt(3) / 2) * a;
        double r = h / 3;
        double R = (2 * h) / 3;

        // Вывод результатов
        System.out.println("Площадь треугольника: " + S);
        System.out.println("Высота треугольника: " + h);
        System.out.println("Радиус вписанной окружности: " + r);
        System.out.println("Радиус описанной окружности: " + R);

        scanner.close();
    }
}
