import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer> a=new TreeSet<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int m=sc.nextInt();
        TreeSet<Integer> b=new TreeSet<>();
        for(int i=0;i<m;i++){
            b.add(sc.nextInt());
        }
        TreeSet<Integer> union=new TreeSet<>(a);
        union.addAll(b);
        if(!union.isEmpty()){
            for(int x:union)
            System.out.print(x+" ");
            System.out.println();
        }
        TreeSet<Integer> inter=new TreeSet<>(a);
        inter.retainAll(b);
        if(!inter.isEmpty()){
            for(int x:inter)
            System.out.print(x+" ");
            System.out.println();
        }
        TreeSet<Integer> sym=new TreeSet<>(union);
        TreeSet<Integer> temp=new TreeSet<>(inter);
        sym.removeAll(temp);
        if(!sym.isEmpty()){
            for(int x:sym)
            System.out.print(x+" ");
            System.out.println();
        }
        System.out.println(Collections.disjoint(a,b));
        System.out.println(b.containsAll(a));
        System.out.println(a.containsAll(b));

    }
}
