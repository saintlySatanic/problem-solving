package classicDSA.bitManipulations;

import java.util.Scanner;

public class UnsetLastSetBit {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("# after unsetting last set bit : " + unsetLastSetBit(x));
        sc.close();
    }

    public static int unsetLastSetBit(int x) {
        /*
        This algorithm is also Known as Brian Kernningam's algorithm

        The idea is for (x-1) there will be all 0's in RHS of first set bit of (x)
        eg: x = 100100 (36) ; x-1 = 100011 (35)
        */
         
        return x & (x-1);
    }
}