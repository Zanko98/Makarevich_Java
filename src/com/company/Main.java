package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {
                System.out.println("* * *  Введите номер алгиритма: * * *\n 1-ввод числа,\n 2-ввод имени,\n 3-ввод числового массива, \n 0-ВЫХОД");
                Scanner sc = new Scanner(System.in);
                int alg = sc.nextInt();
                if (alg == 0) break;
                else if (alg == 1) enterNumber();
                else if (alg == 2) enterName();
                else if (alg == 3) enterArray();
                else {
                    System.out.println("* Введен неверный номер алгоритма. Повторите попытку *");
                }
        } while (true);
    }

    public static void enterNumber() {
        System.out.println("__ Введите число __");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if (n > 7) System.out.println("Привет");
    }

    public static void enterName() {
        System.out.println("__ Введите имя __");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equalsIgnoreCase("Вячеслав")) System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    }

    public static void enterArray() {
        System.out.println("__ Введите колличество элементов массива __");
        Scanner sc = new Scanner(System.in);
        int [] mass = new int[sc.nextInt()];
        System.out.println("__ Введите элементы массива __");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
        }
        for (int i : mass) {
            if (i % 3 == 0) System.out.print(i + "; ");
        }
        System.out.println();
    }
}
