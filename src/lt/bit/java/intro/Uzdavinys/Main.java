package lt.bit.java.intro.Uzdavinys;

public class Main {

    public static void main(String[] args) {

        long amount = 1;

        for (int k = 1; k <= 64; k++) {
            System.out.println(k + " Langelyje yra " + amount + " grudu");
            amount = amount * 2;
        }

        double d = 1.12e-2 + 100; // 0.0123 + 100
        System.out.println(d);

        System.out.println(100 * 3.3);
        System.out.println(11 / 3 * 3);
        System.out.println(11 / 3.0 * 3);

        float f1 = (float)(11 / 3.0 * 3);
        float f2 = 11 / (float)3.0 * 3;
        float f3 = 11 / 3.0F * 3;

        boolean b1 = true; // false
        boolean b2 = f2 > f3;

        char c1 = 25; // 0..64000

//
    }

    // byte (1) -> short (2) -> int (4) -> long (8) -> float -> double
}
