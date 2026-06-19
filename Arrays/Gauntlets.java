import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] f=new int[1001];
        for(int i=0;i<n;i++){
            int color=sc.nextInt();
            f[color]++;
        }
        int  pairs=0;
        for(int i=0;i<=1000;i++){
            pairs+=f[i]/2;
        }
        System.out.println(pairs);
        sc.close();
    }
}
