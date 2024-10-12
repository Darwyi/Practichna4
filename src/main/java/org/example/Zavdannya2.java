package org.example;

import java.util.Scanner;

public class Zavdannya2 {
    //варіант 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Способ з while: ");

        System.out.print("Введіть перше число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int num2 = scanner.nextInt();

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        System.out.println("НСД: " + num1);

        System.out.println("Способ з do-while: ");

        System.out.print("Введіть перше число: ");
        num1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        num2 = scanner.nextInt();

        do {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        } while (num1 != num2);

        System.out.println("НСД: " + num1);
    }
}
