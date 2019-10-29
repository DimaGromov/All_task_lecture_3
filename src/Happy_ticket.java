/*
        Задача про счастливый билетик

        Вводится номер билета.
        Напечатать "Happy", если он счастливый.
        Напечатать "Super", если он супер счастливый.
        Если это обычный билетик - ничего не печатать.

 */

import java.util.Scanner;

public class Happy_ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;                                    // Номер билета.
        byte a1, a2, a3, a4, a5, a6;                // Числа в номере.

        // Ввод номера билета пользователем.
        System.out.print("Введите номер билета (шестизначное число): ");
        num = scanner.nextInt();

        if (num >= 1_000_000) {
            System.out.println("Ошибка! Число должно состоять из 6 цифр!");
        } else if (num < 0) {
            System.out.println("Ошибка! Число не должно быть отрицательным!");
        } else {
            num += 1_000_000;

            a6 = (byte) (num % 10);
            num /= 10;
            a5 = (byte) (num % 10);
            num /= 10;
            a4 = (byte) (num % 10);
            num /= 10;
            a3 = (byte) (num % 10);
            num /= 10;
            a2 = (byte) (num % 10);
            num /= 10;
            a1 = (byte) (num % 10);

            if ((a1 == a4) && (a2 == a5) && (a3 == a6)) {
                System.out.println("Super!");
            } else if ((a1 + a2 + a3) == (a4 + a5 + a6)) {
                System.out.println("Happy!");
            }


        }

    }
}
