package lt.bit.java.p012.interfece.Bank;

import java.time.LocalDate;

public class DummyBank implements CurrencyExchangeRate{

    @Override
    public double getExchangeRate(String currency, LocalDate data) {
        return 1.0;
    }

}
