import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            pq.add(a);
        }
        if(k>n){
            System.out.println("Out of Range");
            return;
        }
        
        int val=0;
        for(int i=0;i<k;i++){
            val=pq.remove();
        }
        System.out.println(val);
        
    }
}
