package QuadEquation;

import java.util.Scanner;

import static QuadEquation.ParametersQuadEquation.calculateDiscriminant;

class ParametersQuadEquation {

    double a;
    double b;
    double c;

    public static double calculateDiscriminant(double a, double b, double c) {
        double discriminant = (b * b) - (4 * a * c);
        return discriminant;
    } // Discriminant method

    public static double x1 (double a, double b, double c) {
        double calculateX1 = ((-b + Math.sqrt(calculateDiscriminant(a, b, c))) / (2 * a));
        return calculateX1;
    } // x1 method

    public static double x2 (double a, double b, double c) {
        double calculateX2 = ((-b - Math.sqrt(calculateDiscriminant(a, b, c))) / (2 * a));
        return calculateX2;
    } // x2 method

} // QuadEquation class

public class QuadEquation {

    public static void main (String[] args) {
        Scanner scA = new Scanner (System.in);
        Scanner scB = new Scanner (System.in);
        Scanner scC = new Scanner (System.in);
        Scanner goOn = new Scanner (System.in);
        String GoOn;

        do {

            System.out.println("Введите параметр a");
            double a = scA.nextDouble();

            System.out.println("Введите параметр b");
            double b = scB.nextDouble();

            System.out.println("Введите параметр c");
            double c = scC.nextDouble();

            System.out.println("Уравнение имеет вид: " + a + "x^2 + " + b + "x + " + c + " = 0");

            if (a==0) {
                System.out.println("Так как параметр а равен нулю, уравнение является линейным.");
                double xln = (-c)/b;
                System.out.print ("x = " + xln);
            }
            else if (a != 0) {
                double discr = calculateDiscriminant(a, b, c);
                if (discr > 0) {
                    double X1 = ParametersQuadEquation.x1(a, b, c);
                    System.out.println("x1 = " + X1);
                    double X2 = ParametersQuadEquation.x2(a, b, c);
                    System.out.println("x2 = " + X2);
                } else if (discr == 0.0) {
                    double X1 = ParametersQuadEquation.x1(a, b, c);
                    System.out.println("Так как дискриминант равен нулю, есть только одно решение. x = " + X1);
                } else if (discr < 0)
                    System.out.println("Нет решения, так как дискриминант отрицательный");
            }

            System.out.println("*******************");
            System.out.println("Решить ещё одно уравнение? (да/нет)");
            do {
                GoOn = goOn.nextLine();
                if (GoOn.equals("да")) {
                    System.out.println("*******************");
                    break;
                } else if (GoOn.equals("нет")) {
                    System.out.println("Хорошего дня!");
                    break;
                } else System.out.println("Пожалуйста, ответьте да или нет");

            } while (!GoOn.equals("да") | !GoOn.equals("нет"));

        } while (GoOn.equals("да"));
    } // main (String[]) method

} // QuadEquation class