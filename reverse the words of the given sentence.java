import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
            if(i!=0){
                System.out.print(" ");
            }
           
        }
    }
}
