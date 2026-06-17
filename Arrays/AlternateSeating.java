import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[m];
        int flag=0;
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            if(a[i]==0){
                boolean l=(i==0 || a[i-1]==0);
                boolean r=(i==m-1||a[i+1]==0);
                if(l&&r){
                    a[i]=1;
                    n--;
                }
            }
        }
        if(n<=0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
