import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sizes
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n3];

        // Read arr1
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        // Read arr2
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        // Read arr3
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        int i = 0, j = 0, k = 0;
        HashSet<Integer> printed = new HashSet<>(); // To avoid duplicates

        while (i < n1 && j < n2 && k < n3) {
            int a = arr1[i], b = arr2[j], c = arr3[k];

            if (a == b && b == c) {
                if (!printed.contains(a)) {
                    System.out.print(a + " ");
                    printed.add(a);
                }
                i++;
                j++;
                k++;
            } else if (a < b) {
                i++;
            } else if (b < c) {
                j++;
            } else {
                k++;
            }
        }
    }
}
