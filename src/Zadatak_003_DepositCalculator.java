import java.util.Scanner;

public class Zadatak_003_DepositCalculator {

    //3.	Deposit Calculator
    //Write a program that calculates how much you will receive at the end
    // of the deposit period at a certain interest rate. Use the following formula:
    //amount = deposited amount + term of the deposit * ((deposited amount * annual interest rate) / 12)
    //Input Data
    //3 lines are read from the console:
    //1.	Deposit amount – a floating-point number in the interval [100.00 … 10000.00]
    //2.	Term of the deposit (in months) – an integer in the interval [1…12]
    //3.	Annual interest rate – a floating-point number in the interval [0.00 …100.00]
    //Output Data
    //Print the amount on the console at the end of the term.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double DepositAmount = Double.parseDouble(scanner.nextLine());
        int Termod = Integer.parseInt(scanner.nextLine());
        double Annual = Double.parseDouble(scanner.nextLine());
        double precent = Annual / 100;
        double interest = DepositAmount * precent;
        double month = interest / 12;
        double amount = DepositAmount + Termod * month;
        System.out.println(amount);

    }
}
