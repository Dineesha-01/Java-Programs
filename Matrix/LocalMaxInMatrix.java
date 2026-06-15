import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]c=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int max=c[i][j];
                for(int r=i;r<i+3;r++){
                    for(int d=j;d<j+3;d++){
                        if(c[r][d]>max){
                            max=c[r][d];
                        }
                    }
                }
                System.out.print(max);
                if(j<n-3){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
