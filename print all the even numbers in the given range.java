import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
