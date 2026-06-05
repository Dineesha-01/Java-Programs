import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("FALSE");
            return;
        }
        int freq[]=new int[26];
        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)-'a']++;
            freq[b.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count!=0){
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE");
    }
}
