package Practica1;

import java.util.Scanner;

public class EJ2 
{
    public static void main(String[] args) 
    {

        double a, b, c, r1, r2;
        double discriminante;
        
        System.out.println("Formula general");
        Scanner input = new Scanner(System.in);

        System.out.println("Dame el valor de a");
        a = input.nextDouble();

        System.out.println("Dame el valor de b");
        b = input.nextDouble();

        System.out.println("Dame el valor de c");
        c = input.nextDouble();

        if (a == 0) 
        {
            System.out.println("No es una ecuación cuadrática");
        } 
        else 
        {
            discriminante = Math.pow(b, 2) - 4 * a * c;

            if (discriminante < 0) 
            {
                System.out.println("No tiene raíces reales");
            } 
            else 
            {
                r1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                r2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                System.out.println("La primera raíz es: " + r1);
                System.out.println("La segunda raíz es: " + r2);
            }
        }

        input.close();
    }
}

