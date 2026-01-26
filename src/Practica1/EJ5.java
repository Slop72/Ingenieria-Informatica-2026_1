package Practica1;

import java.util.Scanner;

public class EJ5 
{
	public static void main(String[] args) 
    {
		System.out.println("Suma de tres numeros enteros menores a 10");
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);

        int suma = num1 + num2 + num3;
        int resultado;

        System.out.println("Cuanto es " + num1 + " + " + num2 + " + " + num3);

        Scanner input = new Scanner(System.in);
        resultado = input.nextInt();

        if (resultado == suma)
            System.out.println("verdadero");
        else
            System.out.println("Falso, es " + suma);

        input.close();
    }
}
