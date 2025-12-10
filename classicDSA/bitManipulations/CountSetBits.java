package classicDSA.bitManipulations;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("#Set bits is : " + countSetBits(x));
        sc.close();
    }

    public static int countSetBits(int x) {
        int setBits = 0;

        while(x > 0) {
            if ((x&1) == 1) setBits++;
            x>>=1;
        }

        return setBits;
    }
}