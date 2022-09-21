import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner b = new Scanner (System.in);
        System.out.println("What is the cost of the bill? ");
        double bill = b.nextDouble();
        Scanner t = new Scanner (System.in);
        System.out.println("What is your tip percentage? ");
        int tipPercent = t.nextInt();
        Scanner p = new Scanner (System.in);
        System.out.println("How many people are in your party? ");
        int peopleNum = p.nextInt();

        double tipValue = tipPercent * 0.01;
        // Calculates the actual percentage of the bill the tip will be.
        double actualTipValue = bill * tipValue;
        // Calculates the monetary value of the tip.
        double billWithTip = bill + actualTipValue;
        // Calculates the total cost of the bill with tip.
        double tipPerPerson = actualTipValue / peopleNum;
        // Calculates the amount of tip each person pays.
        double totalPerPerson = billWithTip / peopleNum;
        // Calculates the value of the total bill each person pays.

        System.out.println("Your total tip is " + actualTipValue + ".");
        System.out.println();
    }
}