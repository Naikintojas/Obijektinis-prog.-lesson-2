package lt.bit.java.klases;

import java.util.Arrays;

public class Klase {

     int nr;
     char raide;
     Mokinys[] mokiniai;

    @Override
    public String toString() {
        return "Klase{" +
                nr + raide +
                ", mokiniai=" + Arrays.toString(mokiniai) +
                '}';
    }
}

