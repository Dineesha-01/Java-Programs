import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.startsWith(s2)&& s1.endsWith(s2))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
