package linear_progs;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четырехзначное число: ");
        int number = scanner.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Ошибка: Введите именно четырехзначное число.");
        } else {
            int d1 = number / 1000;
            int d2 = (number / 100) % 10;
            int d3 = (number / 10) % 10;
            int d4 = number % 10;

            int result = d1 * d2 * d3 * d4;

            System.out.println("Произведение цифр числа: " + result);
        }

        scanner.close();
    }
}
