import java.util.Scanner;

public class Zadatak_005_SuppliesForSchool {

    //Supplies for School
    //The school year has already started and the head of the 10B class - Sophie has to buy a certain number of packets of pens, packets of markers, and detergent for cleaning the board. She is a regular customer of a bookstore, so there is a discount for her, which is a percentage of the total. Write a program that calculates how much money Sophie will have to raise to pay the bill, keeping in mind the following price list:
    //•	Package of pens- 5.80 USD.
    //•	Package of markers - 7.20 USD.
    //•	Detergent- 1.20 USD (for liter)
    //Input Data
    //4 numbers are read from the console:
    //•	Package of pens - an integer in the range [0...100]
    //•	Package of markers – an integer in the range [0...100]
    //•	Liters of detergent – an integer in the range [0…50]
    //•	Percentage reduction – an integer in the range [0...100]
    //Output Data
    //Print on the console how much money Sophie will need to pay her bill.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fp = 100;
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int reduction = Integer.parseInt(scanner.nextLine());
        double pensp = pens * 5.80;
        double merkersp = markers * 7.20;
        double detergentp = detergent * 1.20;
        double priceAll = pensp + merkersp + detergentp;
        double precent = reduction / fp;
        double priceWith = priceAll - (priceAll * precent);
        System.out.println(priceWith);
        //import java.util.Scanner;
        //
        //public class Zadatak05_Supplies_for_School {
        //
        //    public static void main(String[] args) {
        //
        //        Scanner scanner = new Scanner(System.in);
        //
        //        double pens = 5.80;
        //        double markers = 7.20;
        //        double detergent = 1.20;
        //
        //        double pensPrice = Integer.parseInt(scanner.nextLine()) * pens;
        //        double markersPrice = Integer.parseInt(scanner.nextLine()) * markers;
        //        double detergentPrice = Integer.parseInt(scanner.nextLine()) * detergent;
        //        double percentReduction = Double.parseDouble(scanner.nextLine()) / 100;
        //
        //        double allProductsPrice = pensPrice + markersPrice + detergentPrice;
        //
        //        System.out.println(allProductsPrice - (allProductsPrice * percentReduction));
        //
        //
        //    }
        //
        //}
    }
}
