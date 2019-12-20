package tp_note_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Program for converting time to seconds.");
        System.out.print("Please input hours:");
        int h=s.nextInt();
        System.out.print("Please input minutes:");
        int mn=s.nextInt();
        System.out.print("Please input seconds:");
        int se=s.nextInt();
        int second=(h*3600)+(mn*60)+se;
        System.out.println("--------------------------------------------------");
        System.out.printf("Number of seconds ="+h+"x3600 + "+mn+"x60 + "+se+" = "+second+"\n");
        s.close();
    }
}       