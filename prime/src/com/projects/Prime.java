import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            boolean isPrime = checkPrime(n);
        }

    }

    private static boolean checkPrime(int n) {
        if(n==1) return false;
        if ( n==2 || n==3) return true;


        Set<Integer> candidates = new HashSet<Integer>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            candidates.add(i);
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!candidates.contains(i)) {
                continue;
            }
            if(n%i==0) {
                return false;
            }
            else {
                for (int j = 1; j*i<=Math.sqrt(n); j++) {
                    candidates.remove(Integer.valueOf(i*j));
                }
            }
        }
        return true;
    }
}
