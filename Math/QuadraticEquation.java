import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d= (b*b - (4*a*c));
        if(d<0){
            System.out.println("Imaginary Roots");
        }else{
            double r1=(-b+Math.sqrt(d))/(2.0*a);
            double r2=(-b-Math.sqrt(d))/(2.0*a);
            System.out.printf("%.2f %.2f",r1,r2);
        }
    }
}
