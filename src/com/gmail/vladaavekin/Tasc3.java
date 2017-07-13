package com.gmail.vladaavekin;

// Написать программу, которая будет высчитывать длину стороны
// квадрата по периметру (Вводим периметр – на выходе получаем
// длину стороны квадрата).

import java.util.Scanner;

public class Tasc3 {

    public static void main(String[] args) {

        System.out.println("\nTasc 2\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("P (перимет) = ");
        double P = scanner.nextInt();

        System.out.print("сторона квадрата = " + P / 4);

    }

}
