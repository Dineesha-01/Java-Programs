import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    if(!list.contains(a[i]))
                    list.add(a[i]);
                }
            }
        }
        for(int i:list)
        System.out.print(i+" ");
        /*for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    found=true;
                    break;
                }
            }
            boolean already=false;
            for(int k=0;k<i;k++){
                if(a[i]==a[k]){
                    already=true;
                    break;
                }
            }
            if(found && !already){
                System.out.print(a[i]+" ");
            }
        }
        sc.close();*/
    }
}
