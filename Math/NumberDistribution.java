import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int z=0;
        int p=0;
        int ne=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num==0)
            z++;
            else if(num>0)
            p++;
            else
            ne++;
        }
        System.out.println(z+ " "+p+" "+ne);
        sc.close();
    }
}
