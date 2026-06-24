import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long x=sc.nextInt();
        long ans=Math.abs(a-b)%(2*x);
        if(ans==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
