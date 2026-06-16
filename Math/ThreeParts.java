import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        if(sum%3!=0){
            System.out.println("false");
            return;
        }
        int target=sum/3;
        int cur=0,count=0;
        for(int i=0;i<n;i++){
            cur+=a[i];
            if(cur==target){
                count++;
                cur=0;
            }
        }
        System.out.println(count>=3?"true":"false");
    }
}
