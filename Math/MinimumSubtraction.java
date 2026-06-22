import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=1;
        while(temp*2<=n){
            temp=temp*2;
        }
        long x=n-temp;
        System.out.println(x);
    }
}
