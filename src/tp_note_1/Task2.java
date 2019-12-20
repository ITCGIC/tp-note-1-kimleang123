package tp_note_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Program for converting seconds into formated H:M:S");
        System.out.print("Input number of seconds:");
        int num=sc.nextInt();
        int h=num/3600;
        int m1=num%3600;
        int mn=m1/60;
        int s=m1%60;
        System.out.printf("Time corresponding to "+num+ "seconds is "+h+":"+mn+":"+s+".\n");
        sc.close();
    }
}