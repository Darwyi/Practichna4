package org.example;

import java.util.Scanner;

public class Zavdanya3 {
    //варіант 3
        public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Введіть початкове число діапазону: ");
                    int start = scanner.nextInt();

                    System.out.print("Введіть кінцеве число діапазону: ");
                    int end = scanner.nextInt();


                    System.out.print("Введіть цифру від 1 до 9: ");
                    int chislo = scanner.nextInt();


                    if (chislo < 1 || chislo > 9) {
                        System.out.println("Помилка: введіть цифру від 1 до 9.");
                        return;
                    }

                    System.out.println("Числа у діапазоні від " + start + " до " + end + ", які не кратні " + chislo + ":");
                    for (int i = start; i <= end; i++) {
                        if (i % chislo == 0) {
                            continue;
                        }
                        System.out.println(i);
                    }
                }
            }