package lt.bit.java.p012.interfece.Bank;

import java.time.LocalDate;

public interface CurrencyExchangeRate {

    double getExchangeRate(String currency, LocalDate date);
}
