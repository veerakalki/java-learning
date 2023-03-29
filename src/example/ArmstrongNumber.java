package example;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the numer to check");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
                scan.close();
                int original = number;
                int check=0;
                int temp=0;
                while(number>0) {
                    temp = number % 10;
                    check = (check * 10) + temp;
                    number = number / 10;
                }
                if(original == check)
                      System.out.println("it is an Armstrong number.");
                else
                      System.out.println("it is not an Armstrong number.");
    }
}
