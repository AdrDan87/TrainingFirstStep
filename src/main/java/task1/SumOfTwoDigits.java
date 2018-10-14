package task1;

import java.util.Scanner;

public class SumOfTwoDigits {
    public static void main(String[] args) {
        int a, b, sum2;
        a= 4;
        b= 6;
        sum2 = a + b;
        System.out.println("Sum of "+a+" and "+b+" is "+sum2);


        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }


}
