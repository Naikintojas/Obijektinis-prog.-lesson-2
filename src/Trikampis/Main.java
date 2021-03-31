package Trikampis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Iveskite 1 krastine");
        int x = s1.nextInt();

        System.out.println("Iveskite 2 krastine");
        int y = s1.nextInt();

        System.out.println("Iveskite 3 krastine");
        int z = s1.nextInt();
        if ((x + y) > z && (x + z) > y && (y + z) > x) {
            int s = (x + y + z) / 2;
            double plotas = Math.sqrt(s * (s - x) * (s - y) * (s - z));
            System.out.println("Trikampio plotas yra :" + plotas);
        } else
            System.out.println("Toks trikampis neegzistuoja");

        if (x + y > z && x + z > y && y + z > x)
            System.out.println("Trikampis");
        if (x == y && y == z)
            System.out.println("Lygiakraštis trikampis");
        else if (x == y || y == z || z == x)
            System.out.println("Lygiasonis Trikampis");
        else
            System.out.println("Ivairiakrastis Trikampis");

    }

}
