import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=sc.nextInt();
        if(pos>n){
            System.out.println("Deletion not possible.");
            return;
        }
        for(int i=pos-1;i<n;i++){
            arr[i]=arr[i+1];
        }
        n=n-1;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
