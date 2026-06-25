import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int original=N;
        int sum=0;
        while(N>0){
            int digit=N%10;
            sum+=digit*digit*digit;
            N/=10;
        }
        if(sum==original)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
