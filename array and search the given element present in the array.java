import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]==val){
                flag=1;
            }
        }
        if(flag==0){
            System.out.print("Not found");
        }
        else{
            System.out.print("Found");
        }
    }
}
