import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=sc.nextInt();
        for(int i=1;i<n;i++){
            String op=sc.next();
            int num=sc.nextInt();
            if(op.equals("+")){
                res+=num;
            }else if(op.equals("-")){
                res-=num;
            }else if(op.equals("*")){
                res*=num;
            }else if(op.equals("/")){
                res/=num;
            }else if(op.equals("%")){
                res=((res%num)+num)%num;
            }
        }
        System.out.println(res);
    }
}
