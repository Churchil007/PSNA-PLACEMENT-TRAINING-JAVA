import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long a=1;
        long b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(n-2>0){
            long c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            n--;
        }
        
    }
}
