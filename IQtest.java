// Problem: https://codeforces.com/problemset/problem/25/A
// Date: 2026-07-31

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        for (int i = 0; i < n; i++) {
            if (even == 1 && a[i] % 2 == 0) {
                System.out.println(i + 1);
                break;
            }
            if (odd == 1 && a[i] % 2 != 0) {
                System.out.println(i + 1);
                break;
            }
        }

        sc.close();
    }
}