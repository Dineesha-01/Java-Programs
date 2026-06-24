import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=0;i<=n;i++){
            s+=i;
        }
        System.out.println(s);
        //or n*(n+1)/2 (formula) and print
    }
}
