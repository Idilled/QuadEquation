package QuadEquation;

import java.util.Scanner;

import static QuadEquation.ParametersQuadEquation.Discriminant;

class ParametersQuadEquation {

        double a;
        double b;
        double c;

        public static double Discriminant (double a, double b, double c) {
        double D = (b * b) - (4 * a * c);
        return D;
    } // Discriminant method

        public static double x1 (double a, double b, double c) {
        double x1 = ((-b + Math.sqrt(Discriminant (a, b, c))) / (2 * a));
        return x1;
    } // x1 method

        public static double x2 (double a, double b, double c) {
        double x2 = ((-b - Math.sqrt(Discriminant(a, b, c))) / (2 * a));
        return x2;
    } // x2 method

    } // QuadEquation class

public class QuadEquation {

    public static void main (String[] args) {
        Scanner scA = new Scanner (System.in);
        Scanner scB = new Scanner (System.in);
        Scanner scC = new Scanner (System.in);
        Scanner goOn = new Scanner (System.in);
        boolean GoOn;

        do {

            System.out.println("Введите параметр a");
            double a = scA.nextDouble();

            System.out.println("Введите параметр b");
            double b = scB.nextDouble();

            System.out.println("Введите параметр c");
            double c = scC.nextDouble();

            System.out.println("Уравнение имеет вид: " + a + "x^2 + " + b + "x + " + c + " = 0");

            for (double Discr = Discriminant(a, b, c); ; ) {
                if (Discr > 0) {
                    double X1 = ParametersQuadEquation.x1(a, b, c);
                    System.out.println("x1 = " + X1);
                    double X2 = ParametersQuadEquation.x2(a, b, c);
                    System.out.println("x2 = " + X2);
                    break;
                } else if (Discr == 0.0) {
                    double X1 = ParametersQuadEquation.x1(a, b, c);
                    System.out.println("Так как дискриминант равен нулю, есть только одно решение. x = " + X1);
                    break;
                } else if (Discr < 0)
                    System.out.println("Нет решения, так как дискриминант отрицательный");
                break;
            } // if
            System.out.println ("Решить ещё одно уравнение?");
            GoOn = goOn.nextBoolean();

        } while (GoOn = true);
        } // main (String[]) method

    } // QuadEquation class

// Нужно дописать условие, что a != 0 и что можно повторять программу и что + и - в уравнении адекватно выглядели