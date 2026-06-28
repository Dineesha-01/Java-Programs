import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int main=sc.nextInt();
        int addition=sc.nextInt();
        int distance=0;
        while(main>=5 &&  addition>0){
            main-=5;
            distance+=50;
            main+=1;
            addition-=1;
        }
        distance+=main*10;
        System.out.println(distance);
    }
}
