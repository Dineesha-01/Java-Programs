import java.io.*;
import java.util.*;

public class Main {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        static final long Mod=1000000007;
        static boolean isPrime(int n){
            if(n<2) return false;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
        static long fact(int n){
            long ans=1;
            for(int i=2;i<=n;i++)
             ans=(ans*i)%Mod;
            return ans;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int primecount=0;
            for(int i=1;i<=n;i++){
                if(isPrime(i)){
                    primecount++;
                }
            }
            int nonPrime = n-primecount;
            long result=(fact(primecount)*fact(nonPrime))%Mod;
            System.out.println(result);
    }
}
