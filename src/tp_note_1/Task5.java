package tp_note_1;

import java.util.Scanner;

public class Task5 {
    public static void main(final String[] args) {
        final Scanner c = new Scanner(System.in);
        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.println("Conversion rate is: 1 USD = 4000 RIELS");
        System.out.print("Please input money in Riels:");
        int riel=c.nextInt();
        double covert= (double)riel/4000;
        System.out.println("-------------------------------------------------");
        System.out.println(riel+" RIELS = "+covert+" USD");
        c.close();
    }
}