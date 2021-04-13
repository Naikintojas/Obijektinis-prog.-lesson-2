package lt.bit.java.p012.interfece.Bank;

import java.time.LocalDate;

public class LCB implements CurrencyExchangeRate {

    @Override
    public double getExchangeRate(String currency, LocalDate date) {
        return 0.9;
    }
}
