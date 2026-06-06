import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                res.append(Character.toLowerCase(ch));
            }else{
                res.append(Character.toUpperCase(ch));
            }
        }
        System.out.print(res);
    }
}
