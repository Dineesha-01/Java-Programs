import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int i=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();
            int l=sc.nextInt();
            int [][]matrix=new int [n][n];
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    matrix[r][c]=sc.nextInt();
                }
            }
            int sum=0;
            for(int r=i;r<=k;r++){
                for(int c=j;c<=l;c++){
                    sum+=matrix[r][c];
                }
            }
            System.out.println(sum);
            
    }
}
