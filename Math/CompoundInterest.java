import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        int t=sc.nextInt();
        int ci=(int) (p*Math.pow((1+(r/n)),(n*t)));
        int cp=ci-p;
        System.out.println(cp);

    }
}
