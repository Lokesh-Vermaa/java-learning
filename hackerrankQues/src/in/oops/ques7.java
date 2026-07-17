package in.oops;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double payment = input.nextDouble();
        Locale india = new Locale("en", "IN");
        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i = NumberFormat.getCurrencyInstance(india);
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: "+u.format(payment));
        System.out.println("INDIA: "+i.format(payment));
        System.out.println("CHINA: "+c.format(payment));
        System.out.println("FRANCE: "+f.format(payment));
    }
}
