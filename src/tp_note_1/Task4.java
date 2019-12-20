package tp_note_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Program for calculating cost of a call.");
        System.out.print("Please input start hours:");
        int h1=sc.nextInt();
        System.out.print("Please input start minutes:");
        int mn1=sc.nextInt();
        System.out.print("Please input start seconds:");
        int s1=sc.nextInt();
        System.out.print("Please input end hours:");
        int h2=sc.nextInt();
        System.out.print("Please input end minutes:");
        int mn2=sc.nextInt();
        System.out.print("Please input end seconds:");
        int s2=sc.nextInt();
        System.out.println("----------------------------------------- ");
        int start=(h1*3600)+(mn1*60)+s1;
        int end=(h2*3600)+(mn2*60)+s2;
        int s_Total=end-start;
        if(s_Total<0){
            System.out.println("Your end time is smaller than your start time.");
        }
        else{
        int h=s_Total/3600;
        int m1=s_Total%3600;
        int mn=m1/60;
        int s=m1%60;
        float cost= (float) (((h*60) + (mn) + (float)s/60)*0.05);
        System.out.println("Total call duration: "+h+"h "+mn+"mn "+s+"s ");
        System.out.println("Total cost of this call:"+cost+"$");
        }
        sc.close();
    }
    

}