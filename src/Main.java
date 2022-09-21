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
    }
}