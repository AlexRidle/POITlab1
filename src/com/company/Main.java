package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double z1;
        double z2;
        double alpha;

        Scanner text = new Scanner(System.in);
        System.out.print("Начальное значение: ");
        double min = text.nextDouble();
        System.out.print("Конечное значение: ");
        double max = text.nextDouble();
        System.out.print("Шаг: ");
        double step = text.nextDouble();

        for(double i = min; i<=max; i += step) {
            alpha = Math.toRadians(i);
            z1 = Math.cos(alpha) + Math.sin(alpha) + Math.cos(3 * alpha) + Math.sin(3 * alpha);
            z2 = 2 * Math.sqrt(2) * Math.cos(alpha) * Math.sin(((Math.PI) / 4) + 2 * alpha);
            System.out.println("I=" + i + "; " + "Z1=" + z1  + "; " + "Z2=" + z2);
        }
    }
}
