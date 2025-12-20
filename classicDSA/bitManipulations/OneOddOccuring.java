package classicDSA.bitManipulations;

import java.util.Scanner;

public class OneOddOccuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] x = new int[n];
        for(int i=0; i<n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("The odd one occuring is : " + findOneOddOccuring(n, x));
        sc.close();
    }

    public static int findOneOddOccuring(int n, int[] x) {
        if (n%2 == 0) {
            throw new IllegalArgumentException("Invalid number of array items");
        }
        
        int ans = 0;

        for(int i=0; i<n; i++) {
            ans = ans^x[i];
        }

        return ans;
    }
}