import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Character>set=new HashSet<>();
        String str=sc.nextLine().toLowerCase().trim();
        for(char ch: str.toCharArray()){
            if(set.contains(ch)){
                System.out.println("NOT ISOGRAM");
                return;
            }
            set.add(ch);
        }
        System.out.println("ISOGRAM");
    }
}
