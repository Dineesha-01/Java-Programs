import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long fact=1;
        long mod=1000000007;
        for(int i=1;i<=n;i++){
            fact=(fact*i)%mod;    
        }
        System.out.println(fact);
    }
}
