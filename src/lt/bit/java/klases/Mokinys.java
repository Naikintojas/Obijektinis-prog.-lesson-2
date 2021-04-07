package lt.bit.java.klases;

public class Mokinys extends Zmogus {
    int klase;

    public Mokinys() {
        super();
        System.out.println("Mokinys()");
    }

    public Mokinys(int klase, String vardas, String pavarde) {
        super(vardas, pavarde);
        System.out.println("Mokinys(int klase, String vardas, String pavarde)");
        this.klase = klase;
    }

    public String toString() {
        return klase + " klase - " + vardas + " " + pavarde;
    }
}
