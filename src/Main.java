import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner b = new Scanner (System.in);
        System.out.println("What is the cost of the bill? ");
        double bill = b.nextDouble();
        System.out.print(bill);
    }
}