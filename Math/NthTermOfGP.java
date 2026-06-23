import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long r=sc.nextInt();
        long n=sc.nextInt();
        long result=1;
        long power= n-1;
        while(power>0){
            result=result*r;
            power--;
        }
        long nthterm=a*result;
        System.out.println(nthterm);

    }
}
