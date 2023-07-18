import java.util.Scanner;

public class Zadatak_007_FoodDelivery {

    //7.	Food Delivery
    //The restaurant opens its doors and offers several menus at preferential prices:
    //•	Chicken menu – 10.35 USD.
    //•	Fish menu – 12.40 USD.
    //•	Vegetarian menu – 8.15 USD.
    //The group will also order a dessert, the price of which is equal to 20% of the total bill (excluding delivery).
    //The delivery price is 2.50 USD and is finally charged.
    //Input Data
    //3 lines are read from the console:
    //•	Number of chicken menus – an integer in the range [0 … 99]
    //•	Number of fish menus – an integer in the range [0 … 99]
    //•	Number of vegetarian menus – an integer in the range [0 … 99]
    //Output Data
    //Print one line on the console: "{order price}":
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());
        double PrChicken = chicken * 10.35;
        double PrFish = fish * 12.40;
        double PrVegetarian = vegetarian * 8.15;
        double TotalMenu = PrChicken + PrFish + PrVegetarian;
        double prc = 100;
        double Desert = (TotalMenu / prc) * 20;
        double Delivery = 2.50;
        double TotalPrice = TotalMenu + Desert + Delivery;
        System.out.printf("order price}: %.2f", TotalPrice);

    }
}
