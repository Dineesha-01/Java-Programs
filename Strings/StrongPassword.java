import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean d=false;
        boolean l=false;
        boolean u=false;
        boolean sp=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&& ch<='9')
            d=true;
            else if(ch>='a'&&ch<='z')
            l=true;
            else if(ch>='A'&&ch<'Z')
            u=true;
            else 
            sp=true;
        }
        int count=0;
        if(!d)
        count++;
        if(!l)
        count++;
        if(!u)
        count++;
        if(!sp)
        count++;
        int ans=Math.max(count,6-s.length());
        System.out.println(ans);
    }
}
