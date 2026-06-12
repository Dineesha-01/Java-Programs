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
        Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int diff=a[i+1]-a[i];
            if(diff<min){
                min=diff;
            }
        }
        System.out.println(min);
    }
}
