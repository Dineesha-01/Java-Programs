import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=0,b=0,count=0;;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')
            a++;
            else
            b++;
            if(a==b)
            count++;
        }
        System.out.println(count);
    }
}
