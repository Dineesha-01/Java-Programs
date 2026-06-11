import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int low=0;
        int high=n-1;
        boolean found=false;
        while(low<=high){
            int mid=(low+high)/2;
            System.out.println(low+ " "+high+" "+mid);
            if(a[mid]==k){
                found=true;
                break;
            }else if(a[mid]<k)
            low=mid+1;
            else
            high=mid-1;
        }
        if(found)
        System.out.println("True");
        else
        System.out.println("False");
    }
}
