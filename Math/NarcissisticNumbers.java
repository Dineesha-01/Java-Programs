import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int temp=n;
        int count=0;
        while(x>0){
            count++;
            x=x/10;
        }
        int sum=0;
        while(n>0){
            int digit=n%10;
            int pow=1;
            for(int i=1;i<=count;i++){
                pow=pow*digit;
            }
            sum=sum+pow;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
