import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int max=0;
        int current=0;
        for(int i=0;i<N;i++){
            int num=sc.nextInt();
            if(num==1){
                current++;
            max=Math.max(max,current);
            }
            else{
                current=0;
            }
        }
        System.out.println(max);
        sc.close();

    }
}
