import java.util.Scanner;

public class Zadatak_002_RadiansToDegrees {

    //Write a program that reads an angle in radians (decimal number)
    // and converts it to degrees. Use the formula: degree = radian * 180 / π.
    // The number π in Java programs is available through Math.PI.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degree = radians * 180 / Math.PI;
        System.out.println(degree);
    }
}