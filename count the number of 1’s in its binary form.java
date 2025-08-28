import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=1){
            if(n%2!=0){
                count++;
            }
            n=n/2;
        }
        System.out.println(count+1);
    }
}
