import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder st=new StringBuilder(String.valueOf(n));
        for(int i=0;i<st.length()-1;i+=2){
            char temp=st.charAt(i);
             
            
            
            
            st.setCharAt(i,st.charAt(i+1));
            st.setCharAt(i+1,temp);
        }
        System.out.println(st);
    }
    
    
}
