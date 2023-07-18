import java.util.Scanner;

public class Zadatak_001_ConverterUSDtoBGN {
    //Write a program for converting US dollars (USD) into Bulgarian levs (BGN).
    // Use a fixed exchange rate between the dollar and the lev: 1 USD = 1.79549 BGN.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);

    }
}
