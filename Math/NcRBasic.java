import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        long fact1=1;
        long fact2=1;
        long fact3=1;
        for(int i=1;i<=n;i++){
            fact1=fact1*i;
        }
        for(int i=1;i<=r;i++){
            fact2=fact2*i;
        }
        for(int i=1;i<=n-r;i++){
            fact3=fact3*i;
        }
        long ncr=fact1/(fact2*fact3);
        System.out.println(ncr);
    }
}
