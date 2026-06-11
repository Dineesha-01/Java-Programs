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
        int flag=-1;
        for(int i=0;i<n;i++){
            if(a[i]==k){
                flag=i;
                break;
            }
        }
        System.out.println(flag);
    }
}
