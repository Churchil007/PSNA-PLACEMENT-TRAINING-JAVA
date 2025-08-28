import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        int sum=0;
        int i;
        for(i=2;i<=inp;i+=2){
            sum+=i;
        }
        System.out.println(sum);
    }
}
