import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%4==0 && x%100!=0 || x%400==0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
