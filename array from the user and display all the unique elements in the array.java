import java.io.*;
import java.util.*;
import java.util.Map;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        Map<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if (mpp.containsKey(arr[i])) {
    mpp.put(arr[i], mpp.get(arr[i]) + 1);
} else {
    mpp.put(arr[i], 1);
}
        }
        int flag=0;
        for(int i=0;i<n;i++){
            if(mpp.get(arr[i])==1){
                System.out.print(arr[i]+" ");
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("No unique elements in the array");
        }
    }
}
