package com.gmail.vladaavekin;

import java.util.Scanner;

// Написать программу, которая будет высчитывать периметр, площадь,
// для заданного прямоугольника. Ввод сторон прямоугольника
// производится при выполнении программы.

public class Tasc2 {

    public static void main(String[] args) {

        System.out.println("\nTasc 2\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("  ┌───────┐");
        System.out.println("  │            │");
        System.out.println("a │            │");
        System.out.println("  └───────┘");
        System.out.println("          b       ");

        System.out.print("a = ");
        double a = scanner.nextInt();

        System.out.print("b = ");
        double b = scanner.nextInt();

        double P = a * b;

        System.out.print("площадь = " + P);

    }

}
