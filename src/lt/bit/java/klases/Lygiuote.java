package lt.bit.java.klases;

import java.util.Arrays;

public class Lygiuote {

    public static void main(String[] args) {

        Mokinys m1 = new Mokinys();
        m1.klase = 4;
        m1.vardas = "A2";
        m1.pavarde = "D";

        Mokinys m2 = new Mokinys(4, "A1", "C");

        Mokinys[] masyvas = {
                m1,
                m2,
                new Mokinys(2, "A", "C"),
                new Mokinys(1, "C", "A"),
        };
        for (Mokinys m : masyvas) {
            System.out.print(m.klase + " klase " + m.vardas + " " + m.pavarde + ", ");
        }
        System.out.println();

        Mokinys tuscias;
        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (compareTo(masyvas[i], masyvas[j]) > 0) {
                    tuscias = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = tuscias;
                }
            }
            System.out.println((i + ": " + Arrays.toString(masyvas)));
        }
    }

    static int compareTo(Mokinys a, Mokinys b) {
//        boolean r = a > b;
        if (a.klase > b.klase) return 1;
        else if (a.klase < b.klase) return - 1;

        int r = a.pavarde.compareTo(b.pavarde);
        if (r != 0) return r;

        r = a.vardas.compareTo(b.vardas);

        return r;
    }
}

