import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxi=Integer.MIN_VALUE,mini=Integer.MAX_VALUE;
        int sum=0;
        int count=0;
        while(true){
            int n=sc.nextInt();
            if(n==-1) break;
            maxi=Math.max(maxi,n);
            mini=Math.min(mini,n);
            sum+=n;
            count++;
        }
        System.out.println("Min = "+mini);
        System.out.println("Max = "+maxi);
        System.out.println("Sum = "+sum);
        System.out.printf("Average = %.6f",(double)sum/count);
    }
}
