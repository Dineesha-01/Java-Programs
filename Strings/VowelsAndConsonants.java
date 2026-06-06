import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            char ss=Character.toLowerCase(s.charAt(i));
        if(ss=='a'||ss=='e'||ss=='i'||ss=='o'||ss=='u')
        v++;
        else
        c++;
        }
        System.out.print(v+" "+c);
    }
}
