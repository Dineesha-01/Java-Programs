import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int val=sc.nextInt();
                if(i>=j)
                sum +=val;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
