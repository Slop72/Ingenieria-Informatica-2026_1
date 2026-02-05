import java.util.Scanner;

public class Guess 
{
    public static void main(String[] args) 
    {

        int numrand = (int)(Math.random() * 101);
        int val = -1;

        Scanner input = new Scanner(System.in);

        System.out.println("Existe un valor de 0 a 100 y tienes que adivinarlo");

        while (val != numrand) 
        {
            val = input.nextInt();

            if (val > numrand) 
            {
                System.out.println("Te pasaste");
            } 
            else if (val < numrand) 
            {
                System.out.println("Te falta");
            }
        }

        System.out.println("Le atinaste");
        input.close();
    }
}
