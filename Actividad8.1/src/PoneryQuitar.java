import java.util.Scanner;
import java.util.ArrayList;
public class PoneryQuitar 
{
	public static void main(String[] args) 
	{	
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i=1;i<=10;i++)
			numeros.add(i);
		numeros.set(3, 100);
		numeros.remove(1);
		System.out.println("Las frutas con G son:");
		for (int enteros=0; enteros<numeros.size();enteros++) 
		{
		    System.out.println(numeros.get(enteros));
		}		
	}
}
