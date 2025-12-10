package classicDSA.bitManipulations;

import java.util.Scanner;

public class CheckIfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ((x & 1) == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
        sc.close();
    }
}
