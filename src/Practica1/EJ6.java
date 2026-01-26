package Practica1;

import java.util.Scanner;

public class EJ6 
{
	public static void main(String[] args) {
		System.out.println("2 rectágulos");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1 center x y width height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        System.out.print("Enter r2 center x y width height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        // Bordes r1
        double r1_left   = x1 - w1 / 2;
        double r1_right  = x1 + w1 / 2;
        double r1_bottom = y1 - h1 / 2;
        double r1_top    = y1 + h1 / 2;

        // Bordes r2
        double r2_left   = x2 - w2 / 2;
        double r2_right  = x2 + w2 / 2;
        double r2_bottom = y2 - h2 / 2;
        double r2_top    = y2 + h2 / 2;

        // Dentro
        boolean inside =
                r2_left   >= r1_left &&
                r2_right  <= r1_right &&
                r2_top    <= r1_top &&
                r2_bottom >= r1_bottom;

        // Traslape
        boolean overlap =
                !(r2_left > r1_right ||
                  r2_right < r1_left ||
                  r2_top < r1_bottom ||
                  r2_bottom > r1_top);

        if (inside)
            System.out.println("r2 is inside r1");
        else if (overlap)
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlap r1");

        input.close();
    }
}
