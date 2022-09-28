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

        double tipValue = Math.round((tipPercent * 0.01) * 100.0) / 100.0;
        // Calculates the actual percentage of the bill the tip will be.
        double actualTipValue = Math.round((bill * tipValue) * 100.0) / 100.0;
        // Calculates the monetary value of the tip.
        double billWithTip = Math.round((bill + actualTipValue) * 100.0) / 100.0;
        // Calculates the total cost of the bill with tip.
        double tipPerPerson = Math.round((actualTipValue / peopleNum) * 100.0) / 100.0;
        // Calculates the amount of tip each person pays.
        double totalPerPerson = Math.round((billWithTip / peopleNum) * 100.0) / 100.0;
        // Calculates the value of the total bill each person pays.

        System.out.println("Your total tip is $" + actualTipValue + ".");
        System.out.println("Your total bill is $" + billWithTip + ".");
        System.out.println("Each person owes $" + tipPerPerson + " in tips.");
        System.out.println("Each person owes $" + totalPerPerson + " in total.");
    }
}