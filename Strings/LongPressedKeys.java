import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String t=sc.next();
        int i=0,j=0;
        while(j<t.length()){
            if(i<n.length()&&n.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else if(j>0&& t.charAt(j)==t.charAt(j-1)){
                j++;
            }else{
                System.out.println("false");
                return;
            }
        }
        System.out.println(i==n.length()?"true":"false");
    }
}
