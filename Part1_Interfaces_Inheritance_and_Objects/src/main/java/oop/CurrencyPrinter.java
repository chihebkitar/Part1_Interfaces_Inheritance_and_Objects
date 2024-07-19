package oop;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyPrinter {
    public static void main(String[] args){
        double amount =1342532.2423;
        //NumberFormat is abstract class
        NumberFormat nf =
                NumberFormat.getCurrencyInstance();
        // getCurrencyInstance is static methode NumberFormat abs class
        System.out.println(nf.format(amount));
        nf= NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(amount));
// getCurrencyInstance is factory methode
        System.out.println(nf.getClass().getName());
        //DecimalFormat
    }
}
