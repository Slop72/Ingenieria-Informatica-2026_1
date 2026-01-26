package Practica1;

import java.util.Scanner;

public class EJ4 
{
	public static void main(String[] args) 
    {
		System.out.println("Suma de dos numeros enteros menores a 100");
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        int suma = num1 + num2;
        int resultado;

        System.out.println("Cuanto es " + num1 + " + " + num2);

        Scanner input = new Scanner(System.in);
        resultado = input.nextInt();

        if (resultado == suma)
            System.out.println("verdadero");
        else
            System.out.println("Falso, es " + suma);

        input.close();
    }
}
