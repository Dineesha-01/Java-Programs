import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long hash=0;
        long pow=11;
        for(int i=0;i<s.length();i++){
            hash+=(long)s.charAt(i)*pow;
            pow*=11;
        }
        System.out.println(hash);
    }
}
