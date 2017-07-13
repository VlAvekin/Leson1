package com.gmail.vladaavekin;

// Написать программу, которая будет высчитывать корни для
// квадратного уравнения. Ввод коэффициентов при неизвестных
// производится при выполнении программы.

import java.util.Scanner;

public class Tasc1 {

    public static void main(String[] args) {

        System.out.println("\nTasc 1\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициенты для квадратного уравнения (ax^2 + bx + c = 0):");

        System.out.print("a = ");
        double a = scanner.nextInt();

        System.out.print("b = ");
        double b = scanner.nextInt();

        System.out.print("c = ");
        double c = scanner.nextInt();

        double x1;
        double x2;

        // Вычисляем дискриминант
        double d = ( b * b ) - ( 4 * a * c );

        if (d < 0) {

            System.out.println("уравнение не имеет корней");

        } else if (d == 0) {
            x1 = ( -1 * b ) / ( 2 * a );

            System.out.println("Дискриминант D = " + d);
            System.out.println("x = " + x1);

        } else if (d > 0) {
            x1 = (( -1 * b ) - Math.sqrt(d) ) / ( 2 * a );
            x2 = (( -1 * b ) + Math.sqrt(d) ) / ( 2 * a );

            System.out.println("Дискриминант D = " + d);
            System.out.format("x1 = %x1 ; x2 = %x2", x1, x2);
        }

    }

}
