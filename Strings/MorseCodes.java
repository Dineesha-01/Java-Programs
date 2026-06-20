import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] morse={
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
            String word=sc.next();
            StringBuilder sb=new StringBuilder();
            for(char ch:word.toCharArray()){
                sb.append(morse[ch - 'a']);
            }
            set.add(sb.toString());
        }
        System.out.println(set.size());
    }
}
