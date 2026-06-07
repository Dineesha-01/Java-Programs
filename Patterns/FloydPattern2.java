import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        for(int i=1;i<=n;i++){
            a=i;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a=a+(n-j);
            }
            System.out.println();
        }
    }
}
