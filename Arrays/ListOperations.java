import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String cmd=sc.next();
            if(cmd.equals("append")){
                int x=sc.nextInt();
                list.add(x);
                print(list);    
            }else if(cmd.equals("count")){
                int x=sc.nextInt();
                int c=0;
                for(int num:list){
                    if(num==x)
                    c++;
                }
                System.out.println(c);
            }else if(cmd.equals("reverse")){
                Collections.reverse(list);
                print(list);
            }else if(cmd.equals("insert")){
                int pos=sc.nextInt();
                int x=sc.nextInt();
                list.add(pos,x);
                print(list);
            }else if(cmd.equals("sort")){
                Collections.sort(list);
                print(list);
            }else if(cmd.equals("index")){
                int x=sc.nextInt();
                System.out.println(list.indexOf(x));
            }else if(cmd.equals("length")){
                System.out.println(list.size());
            }else if(cmd.equals("extend")){
                ArrayList<Integer> temp=new ArrayList<>(list);
                list.addAll(temp);
                print(list);
            }
        }
    }
    static void print(ArrayList<Integer> list){
            for(int x:list){
                System.out.print(x+" ");
            }
            System.out.println();
    }
 }
