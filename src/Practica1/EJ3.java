package Practica1;

import java.util.Scanner;

public class EJ3 
{
	 public static void main(String[] args) 
	 {
		 	
	        double a, b, c, d, e, f, r1, r2;
	        
	        System.out.println("Cramer 2x2");
	        Scanner input = new Scanner(System.in);

	        System.out.println("Dame el valor de a");
	        a = input.nextDouble();

	        System.out.println("Dame el valor de b");
	        b = input.nextDouble();

	        System.out.println("Dame el valor de c");
	        c = input.nextDouble();
	        
	        System.out.println("Dame el valor de d");
	        d = input.nextDouble();

	        System.out.println("Dame el valor de e");
	        e = input.nextDouble();
	            
	        System.out.println("Dame el valor de f");
	        f = input.nextDouble();
	        
	        if(Math.abs(a*d-b*c) < 1e-9)
	        	System.out.println("La ecuación no tiene solución única");
	        else
	        {
	        	r1=((e*d-b*f)/(a*d-b*c));
		        r2=((a*f-e*c)/(a*d-b*c));	
		        
		        System.out.println("El valor de x es: " + r1);
		        System.out.println("El valor de y es: " + r2);
	        }

	        	
	        input.close();
	 }
}
