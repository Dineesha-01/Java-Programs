import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t=0;
        for(int i=0;i<n;i++){
            int mincost=Integer.MAX_VALUE;
            for(int b=0;b<=2;b++){
                if(a[i]!=b){
                    int cost=Math.abs(a[i]-b);
                    if(cost<mincost){
                        mincost=cost;
                    }
                }
            }
            t+=mincost;
        }
        System.out.println(t);

    }
}
