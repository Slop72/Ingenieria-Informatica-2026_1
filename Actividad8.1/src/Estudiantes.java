import java.util.Scanner;
import java.util.ArrayList;
public class Estudiantes 
{
	public static void main(String[] args) 
	{	
		Scanner input=new Scanner(System.in);
		ArrayList<String> estudiantes = new ArrayList<>();
		estudiantes.add("Sebastian");
		estudiantes.add("Emiliano");
		estudiantes.add("Alonso");
		System.out.println("Los estudiantes son:");
		for (int enteros=0; enteros<estudiantes.size();enteros++) 
		{
		    System.out.println((enteros+1)+"_"+estudiantes.get(enteros));
		}
		
		System.out.println("Inserte el numero del estudiante que quiera eliminar (del 1 al 3)");
		int seleccion =input.nextInt();
		if (seleccion >= 1 && seleccion <= estudiantes.size()) 
        {
            String nombre = estudiantes.get(seleccion - 1);
            
            if (estudiantes.contains(nombre)) 
            {
                estudiantes.remove(nombre);
                System.out.println("Estudiante eliminado: " + nombre);
            }
        } 
        else 
            System.out.println("Numero no valido");
		
		System.out.println("Los estudiantes son:");
		for (int enteros=0; enteros<estudiantes.size();enteros++) 
		{
		    System.out.println((enteros+1)+"_"+estudiantes.get(enteros));
		}
	}
}
