import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;
        if(n<0){
            x=-n;
        }else{
            x=n;
        }
        int rev=0;
        while (x!=0){
            int num= x%10;
            rev=rev*10+num;
            x=x/10;
        }
        if(n<0)
        rev=-rev;
        System.out.println(rev);
    }
}
