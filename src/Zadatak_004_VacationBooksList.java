import java.util.Scanner;

public class Zadatak_004_VacationBooksList {

    //Vacation Books List
    //There are several books on John’s list of required literature for the summer vacation.
    // Because John prefers to play with friends outside,
    // your task is to help him calculate how many hours a day he has
    // to spend reading the necessary literature.
    //Input Data
    //3 lines are read from the console:
    //1.	Number of pages in the current book – an integer in the interval [1…1000]
    //2.	Pages read in 1 hour - an integer in the interval [1…1000]
    //3.	The number of days for which you must read the book - an integer in the range [1…1000]
    //Output Data
    //To print on the console the number of hours that John has to spend reading each day.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumPages = Integer.parseInt(scanner.nextLine());
        int Page = Integer.parseInt(scanner.nextLine());
        int NumDays = Integer.parseInt(scanner.nextLine());
        int time = NumPages / Page;
        int hours = time / NumDays;
        System.out.println(hours);

    }
}
