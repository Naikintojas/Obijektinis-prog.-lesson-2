package lt.bit.java.daugyboslentele;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

//        int a, b;
//            for(a = 1; a <= 9; a++) {
//                System.out.println("Multiplication table of : " + a);
//                for(b = 1; b <= 10; b++) {
//                    System.out.println(a + " * " + b + " = " + (a * b));
//                }
//            }

//        for (int row = 1; row <= 10; row++) {
//            for (int col = 1; col <= 3; col++) {
//                System.out.print(col + " x " + row + " = " + col * row + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int row = 1; row <= 10; row++) {
//            for (int col = 4; col <= 6; col++) {
//                System.out.print(col + " x " + row + " = " + col * row + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int row = 1; row <= 10; row++) {
//            for (int col = 7; col <= 9; col++) {
//                System.out.print(col + " x " + row + " = " + col * row + "\t");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 3; i++) {
            for (int row = 1; row <=10; row++) {
                for (int col = i * 3 + 1; col <= i * 3 + 1 + 2; col++) {
                    System.out.print(col + " x " + row + " = " + col * row + "\t");
                }
                System.out.println();
            }

            System.out.println();
        }
    }

}
