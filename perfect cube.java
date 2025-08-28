import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  val=(int)Math.cbrt(n);
        if(val*val*val==n){
            System.out.println("Perfect Cube");
        }
        else{
            System.out.println("Not a Perfect Cube");
        }
        
    }
}
