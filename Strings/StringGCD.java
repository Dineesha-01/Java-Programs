import java.io.*;
import java.util.*;

public class Main {
    static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(!(s1+s2).equals(s2+s1)){
            System.out.println("-1");
            return;
        }
        int len=gcd(s1.length(),s2.length());
        System.out.println(s1.substring(0,len));

    }
}
