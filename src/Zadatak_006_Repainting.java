import java.util.Scanner;

public class Zadatak_006_Repainting {

    //Repainting
    //Peter wants to repaint the living room and has hired craftsmen for this purpose. Write a program that calculates the cost of repairs, given the following prices:
    //•	Protective nylon - 1.50 USD per square meter
    //•	Paint - 14.50 USD for liter
    //•	Paint thinner - 5.00 USD for a liter
    //Just in case, to the necessary materials, Peter wants to add another 10% of the amount of paint and 2 square meters of nylon, of course, 0.40 USD for bags. The amount paid to the masters for 1 hour of work is equal to 30% of the sum of all costs for materials.
    //Input Data
    //The input is readable from the console and contains 4 lines:
    //1.	Required amount of nylon (in square meters) – an integer in the range [1... 100]
    //2.	Required amount of paint (in liters) – an integer in the range [1…100]
    //3.	Quantity of detergent (in liters) – an integer in the range [1…30]
    //4.	Hours for which the workers will do the work - an integer in the interval [1…9]
    //Output Data
    //On the console print:
    //•	"{total sum of all costs}"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double prc = 100;
        double Sumnylon = (nylon + 2) * 1.50;
        double paintprc = (paint / prc) * 10;
        double SumPaint = (paint + paintprc) * 14.50;
        double Sumdetergent = detergent * 5.00;
        double bags = 0.40;
        double SumMaterials = Sumnylon + SumPaint + Sumdetergent + bags;
        double WorkPrc = (SumMaterials / prc) * 30;
        double SumWork = WorkPrc * hours;
        double Total = SumMaterials + SumWork;
        System.out.println(Total);


    }
}
