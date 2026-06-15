import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]mat=new int[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
                if(mat[i][j]==0){
                    count++;
                }
            }
        }
        int total=n*m/2;
        if(count>total)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
