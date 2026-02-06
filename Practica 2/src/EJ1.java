import java.util.Scanner;

public class EJ1 
{
	public static final double CENTIMETERS_PER_INCH = 2.54;
    public static final int INCHES_PER_FOOT = 12;
    
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Ingrese el valor para pies");
		double feet=input.nextDouble();
		System.out.println("Ingrese otro valor para pulgadas");
		double inch= input.nextDouble();
		System.out.println("tus pies son: "+feet+" y tus pulgadas son: "+inch);
		double finch=feet*INCHES_PER_FOOT;
		double cminch=inch*CENTIMETERS_PER_INCH;
		System.out.println("tus pies a pulgadas son: "+finch);
		System.out.println("tus pulgadas a centimetros son: "+cminch);
	}
}
