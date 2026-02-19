import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MiniInventario 
{
    public static void main(String[] args) 
    {	
        Scanner input = new Scanner(System.in);
        ArrayList<String> Inventario = new ArrayList<>();
        
        Inventario.add("Corn Pops");
        Inventario.add("Queso badotas");
        Inventario.add("Jamon serrano");
        Inventario.add("Shampoo palmolive");
        Inventario.add("Ibuprofeno");

        Collections.sort(Inventario);

        System.out.println("El numero de elementos son: " + Inventario.size());
        System.out.println("El inventario es:");
        
        for (int i = 0; i < Inventario.size(); i++) 
        {
            System.out.println((i + 1) + "_" + Inventario.get(i));
        }
        
        System.out.println("Desea Eliminar (1) o agregar (2) productos");
        int EliAgre = input.nextInt();
        input.nextLine();

        switch (EliAgre)
        {
            case 1:
                System.out.println("Inserte el numero de producto que quiera eliminar (del 1 al " + Inventario.size() + ")");
                int seleccion = input.nextInt();
                
                if (seleccion >= 1 && seleccion <= Inventario.size()) 
                {
                    String nombre = Inventario.get(seleccion - 1);
                    
                    if (Inventario.contains(nombre)) 
                    {
                        Inventario.remove(nombre);
                        System.out.println("Producto eliminado: " + nombre);
                    }
                } 
                else
                    System.out.println("Numero no valido");
                break;

            case 2:
                System.out.println("Escriba el nombre del producto a agregar:");
                String nuevo = input.nextLine();
                Inventario.add(nuevo);
                break;

            default:
                System.out.println("Opcion no valida");
        }

        Collections.sort(Inventario);

        System.out.println("El numero de elementos son: " + Inventario.size());
        System.out.println("Los productos son:");
        for (int i = 0; i < Inventario.size(); i++) 
        {
            System.out.println((i + 1) + "_" + Inventario.get(i));
        }

        input.close();
    }
}
