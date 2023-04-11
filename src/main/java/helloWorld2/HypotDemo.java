package helloWorld2;

import java.util.Scanner;

public class HypotDemo {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый катет::: ");
        double cathetus1 = scanner.nextDouble();
        System.out.println("Первый катет равен::: " + cathetus1);

        System.out.println("Введите второй катет::: ");
        double cathetus2 = scanner.nextDouble();
        System.out.println("Второй катет равен::: " + cathetus2);

        double hypot = Math.sqrt((cathetus1*cathetus1) + (cathetus2*cathetus2));
        String roundOff = String.format("%.2f", hypot);

        System.out.println("Гипотенуза равна корню из суммы квадратов катетов:::" + roundOff);

    }

}
