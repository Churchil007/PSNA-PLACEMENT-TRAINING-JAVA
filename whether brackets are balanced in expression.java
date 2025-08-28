import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().trim();
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='('){
                count++;
            }
            if(ch==')'){
                count--;
                if(count<0){
                    System.out.println("Unbalanced");
                    return;
                }
            }
        }
        if(count==0){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }
    }
}
