import java.util.Scanner;
import java.util.ArrayList;
public class Frutas
{
	public static void main(String[] args) 
	{	
		ArrayList<String> frutas = new ArrayList<>();
		frutas.add("Guanabana");
		frutas.add("Granada");
		frutas.add("Guayaba");
		frutas.add("Grosella");
		frutas.add("Guineo");
		System.out.println("Las frutas con G son:");
		for (int enteros=0; enteros<frutas.size();enteros++) 
		{
		    System.out.println(frutas.get(enteros));
		}
	}
}
