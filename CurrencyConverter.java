package com.converter;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class CurrencyConverter {

    @WebMethod
    public double convertINRtoUSD(double inrAmount) {
        double conversionRate = 75.0; // 1 USD = 75 INR
        return inrAmount / conversionRate;
    }
}
