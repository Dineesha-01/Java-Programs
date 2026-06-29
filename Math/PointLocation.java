import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        long x1=sc.nextLong();
        long y1=sc.nextLong();
        long x2=sc.nextLong();
        long y2=sc.nextLong();
        long x3=sc.nextLong();
        long y3=sc.nextLong();
        long value=(x2-x1)*(y3-y1) - (y2-y1)*(x3-x1);
        if(value>0)
        System.out.println("LEFT");
        else if(value<0)
        System.out.println("RIGHT");
        else
        System.out.println("TOUCH");
    }
}
