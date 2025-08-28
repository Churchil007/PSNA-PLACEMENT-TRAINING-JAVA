import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        // Handle sign
        boolean isNegative = false;
        if (a < 0 && b < 0) {
            a = -a;
            b = -b;
        } else if (a < 0) {
            a = -a;
            isNegative = true;
        } else if (b < 0) {
            b = -b;
            isNegative = true;
        }

        // Multiply using addition
        for (int i = 0; i < b; i++) {
            result += a;
        }

        if (isNegative)
            result = -result;

        System.out.println(result);
    }
}
