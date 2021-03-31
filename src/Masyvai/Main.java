package Masyvai;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int b;
        int[] a = {10, 2, 32, 2, -11, 9, -5, -15};

        System.out.println("Pradinis masyvas " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] < a[j]) {

                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
        }
        System.out.println(" Galutinis masyvas :" + Arrays.toString(a));

    }
}
