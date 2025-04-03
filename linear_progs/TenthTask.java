package linear_progs;
import java.util.Scanner;
public class TenthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину окружности (C): ");
        double C = scanner.nextDouble();

        // Вычисление площади круга
        double S = Math.pow(C, 2) / (4 * Math.PI);

        System.out.println("Площадь круга: " + S);

        scanner.close();
    }
}
