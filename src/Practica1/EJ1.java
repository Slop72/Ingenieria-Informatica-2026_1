package Practica1;

import java.util.Scanner;

public class EJ1 
{
    public static void main(String[] args) 
    {
    	System.out.println("Ejemplo de clase");
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        int suma = num1 + num2;
        int resultado;

        System.out.println("Cuanto es " + num1 + " + " + num2);

        Scanner input = new Scanner(System.in);
        resultado = input.nextInt();

        if (resultado == suma)
            System.out.println("Bien");
        else
            System.out.println("No, es " + suma);

        input.close();
    }
}
