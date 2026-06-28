import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        char min='9';
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)<min){
                min=n.charAt(i);
            }
        }
        System.out.println(min);

    }
}
