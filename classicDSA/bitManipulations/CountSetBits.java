package classicDSA.bitManipulations;

import java.util.Scanner;

public class CountSetBits {
    private static int[] lookup;

    public static void initializeLookup() {
        lookup = new int[256];
        
        for(int i=1; i<255; i++) lookup[i] = lookup[i&(i-1)] + 1;
    }

    public static int countSetBitsLookup(int x) {
        return lookup[x & 255] + lookup[(x>>8)&255] + lookup[(x>>16)&255] + lookup[x>>24];
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("#Set bits is : " + countSetBits(x));
        System.out.println("#Set bits is : " + countSetBitsBrianKerninghamAlgo(x));
        sc.close();

        initializeLookup();
        System.out.println("#Set bits is : " + countSetBitsLookup(x));
    }

    public static int countSetBits(int x) {
        int setBits = 0;

        while(x > 0) {
            if ((x&1) == 1) setBits++;
            x>>=1;
        }

        return setBits;
    }
    
    public static int countSetBitsBrianKerninghamAlgo(int x) {
        int setBits = 0;
        while(x > 0) {
            x = (x & (x-1));
            setBits++;
        }

        return setBits;
    }
}