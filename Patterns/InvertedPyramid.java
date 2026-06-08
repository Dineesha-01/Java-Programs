import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                if(i==n||j==i||j==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}
