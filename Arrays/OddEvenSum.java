import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int o=0;
        int e=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                e +=num;
            }else{
                o+=num;
            }
        }
        System.out.println(o+" "+e);
        sc.close();
    }
}
