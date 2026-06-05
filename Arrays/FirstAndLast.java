import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int X=sc.nextInt();
        int first=0,last=0;
        for(int j=0;j<N;j++){
            if(arr[j]==X){
                first=j;
                break;
            }
        }
        for(int k=N-1;k>=0;k--){
            if(arr[k]==X){
                last=k;
                break;
            }
        }
        System.out.println(+first+" "+last);
    }
}
