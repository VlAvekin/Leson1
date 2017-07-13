package com.gmail.vladaavekin;

// Написать программы, которые будут высчитывать значение
// переменной ans, по заданным ниже формулам (для всех
// переменных используйте тип double) :

import java.util.Scanner;

public class Tasc4 {

    public static void main(String[] args) {

        System.out.println("\nTasc 4\n");
        Scanner scanner = new Scanner(System.in);

        double ans = 0;

        System.out.println("((b + sqrt(b * b + 4 * a * c)) / (2 * a) ) - a * a * a * c + (1 / b * b)");

        System.out.print("a = ");
        double a = scanner.nextInt();

        System.out.print("b = ");
        double b = scanner.nextInt();

        System.out.print("c = ");
        double c = scanner.nextInt();

        ans = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) ) - a * a * a * c + (1 / b * b);

        System.out.println("1 = " + ans);


        System.out.println("x - ((x * x * x) / 3) + ((x * x * x * x * x) / 5))");

        System.out.print("x = ");
        double x = scanner.nextInt();

        ans = (x - ((x * x * x) / 3) + ((x * x * x * x * x) / 5));

        System.out.println("2 = " + ans);


        System.out.println("((x + y) / (y + 1)) - ((x * y - 12) / (34 + x))");

        System.out.print("x = ");
        x = scanner.nextInt();

        System.out.print("y = ");
        double y = scanner.nextInt();

        ans = ((x + y) / (y + 1)) - ((x * y - 12) / (34 + x));

        System.out.println("3 = " + ans);


        System.out.println("sin(sqrt(x + 1)) - sin(sqrt(x - 1))");

        System.out.print("x = ");
        x = scanner.nextInt();

        ans = Math.sin(Math.sqrt(x + 1)) - Math.sin(Math.sqrt(x - 1));

        System.out.println("4 = " + ans);

    }

}
