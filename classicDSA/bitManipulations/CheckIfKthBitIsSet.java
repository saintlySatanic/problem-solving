package classicDSA.bitManipulations;

import java.util.Scanner;

public class CheckIfKthBitIsSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = sc.nextInt();

        System.out.println("Is Kth bit set : " + checkIfKthBitIsSet(x, k));
        sc.close();
    }

    public static boolean checkIfKthBitIsSet(int x, int k) {
        // k's range is 0 - 31
        int mask = (1<<k);
        if ((mask & x) == 0) return false;

        return true;
    }
}