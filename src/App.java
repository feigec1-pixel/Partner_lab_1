import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;                                                                                                                          
        while (x > 0) {
            Scanner in = new Scanner(System.in);
            menu(in);
            x = x - 1;
        }
        System.out.println("Program finished.");
    }

    public static void menu (Scanner in) {
        System.out.println("Choose one of the following options: ");
        System.out.println("(1) Convert Pounds And Ounces To Grams");
        System.out.println("(2) Convert Grams To Pounds And Ounces");
        System.out.println("(3) Convert Feet And Inches To Meters");
        System.out.println("(4) Convert Meters To Feet And Inches");
        System.out.println("(5) Convert Hours, Minutes, And Seconds To Total Seconds");
        System.out.println("(6) Convert Quarters, Dimes, Nickels, And Pennies To Total Amount");
        System.out.println("Option: ");
        int option = in.nextInt();
        switch(option) {
            case 1:
                PoundsAndOuncesToGrams(in);
                break;
            case 2:
                gramsToPoundsAndOunces(in);
                break;
            case 3:
                FeetAndInchesToMeters(in);
                break;
            case 4:
                metersToFeetAndInches(in);
                break;
            case 5:
                time(in);
                break;
            case 6:
                change(in);
                break;
            default:
                System.out.println("Invalid option");
            }
    }
    public static void time (Scanner in) {
        System.out.print("Enter hours: ");
        int hours = in.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = in.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = in.nextInt();
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("Total seconds: " + totalSeconds);
    }

    public static void change (Scanner in) {
        System.out.print("Enter amount in quarters: ");
        int quarters = in.nextInt();
        System.out.print("Enter amount in dimes: ");
        int dimes = in.nextInt();
        System.out.print("Enter amount in nickels: ");
        int nickels = in.nextInt();
        System.out.print("Enter amount in pennies: ");
        int pennies = in.nextInt();
        double total = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);
        System.out.println("Total amount: $" + total);
    }

    
    public static void PoundsAndOuncesToGrams (Scanner in) {
        System.out.print("Enter pounds: ");
        double pounds = in.nextDouble();
        System.out.print("Enter ounces: ");
        double ounces = in.nextDouble();
        double grams = (pounds * 453.592) + (ounces * 28.3495);
        System.out.println("Grams: " + grams);
    }
    public static void gramsToPoundsAndOunces (Scanner in) {
        System.out.print("Enter grams: ");
        double grams = in.nextDouble();
        double totalPounds = grams / 453.592;
        int pounds = (int) totalPounds;
        double ounces = (totalPounds - pounds) * 16;
        System.out.println("Pounds: " + pounds + ", Ounces: " + ounces);
    }
    public static void FeetAndInchesToMeters (Scanner in) {
        System.out.print("Enter feet: ");
        double feet = in.nextDouble();
        System.out.print("Enter inches: ");
        double inches = in.nextDouble();
        double meters = (feet * 0.3048) + (inches * 0.0254);
        System.out.println("Meters: " + meters);
    }
    public static void metersToFeetAndInches (Scanner in) {
        System.out.print("Enter meters: ");
        double meters = in.nextDouble();
        double totalFeet = meters / 0.3048;
        int feet = (int) totalFeet;
        double inches = (totalFeet - feet) * 12;
        System.out.println("Feet: " + feet + ", Inches: " + inches);
    }
}
