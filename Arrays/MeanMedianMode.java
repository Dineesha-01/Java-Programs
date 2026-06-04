import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double sum=0;
        for(int num : arr){
            sum+=num;
        }
        double mean=sum/n;
        Arrays.sort(arr);
        double median;
        if(n%2==0)
        median=((arr[n/2]+arr[n/2-1])/2.0);
        else
        median=arr[n/2];
        HashMap<Integer,Integer>map=new HashMap<>();
        int mode=arr[0],max=0;
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>max){
            max=map.get(num);
            mode=num;
            }
        }
        System.out.printf("%.2f %.2f %d",mean,median,mode);
    }
}
