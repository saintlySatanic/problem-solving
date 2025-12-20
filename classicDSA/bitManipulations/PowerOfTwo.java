package classicDSA.bitManipulations;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println(x + " is power of 2 : " + checkIfPowerOfTwo(x));

        sc.close();
    }

    public static boolean checkIfPowerOfTwo(int x) {
        if (x <= 0) return false;

        return ((x & (x-1)) == 0) ? true: false;
    }
}