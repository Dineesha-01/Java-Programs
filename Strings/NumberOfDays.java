import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String d1=sc.next();
        String d2=sc.next();
        LocalDate date1=LocalDate.parse(d1);
        LocalDate date2=LocalDate.parse(d2);
        long days=Math.abs(ChronoUnit.DAYS.between(date1,date2));
        System.out.println(days);
    }
}
