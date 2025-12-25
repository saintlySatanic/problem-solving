package classicDSA.bitManipulations;

import java.util.Scanner;

public class TwoOddOccuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] x = new int[n];
        for(int i=0; i<n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("The two odd occurings are : ");
        for(int i: findTwoOddOccuring(n, x)) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }

    public static int[] findTwoOddOccuring(int n, int[] x) {
        if (n%2 != 0) {
            throw new IllegalArgumentException("Invalid number of array items");
        }
        int ans = 0;
        int res[] = new int[] {0, 0};

        for(int i=0; i<n; i++) {
            ans = ans^x[i];
        }

        int posOfFirstSetBit = findFirstSetBitPos(ans);
        if (posOfFirstSetBit != -1) {

            int ansA = 0, ansB = 0;
            int mask = 1<<posOfFirstSetBit;

            for(int i=0; i<n; i++) {
                if ((x[i]&mask) == 0 ) ansA = ansA^x[i];
                else ansB = ansB^x[i];
            }

            res[0] = ansA; res[1] = ansB;
        }

        return res;
    }

    public static int findFirstSetBitPos(int x) {
        if (x == 0) return -1;
        
        // 0th position is LSB
        int pos = 0;
        while(x != 0) {
            if ((x&1) == 1) break;

            pos++;
            x>>=1;
        }

        return pos;
    }

    public static int findFirstSetBitNumber(int x) {
        /*
        Will return the number with last set bit, 0110 --> 0010
        Shortcut to find number with all 1's stripped except at the least significant position
        */

        return x & ~(x-1);
    }
}