// Problem: https://codeforces.com/problemset/problem/1/A
// Date: 2026-07-25

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long x = (n + a - 1) / a;
        long y = (m + a - 1) / a;

        System.out.println(x * y);
    }
}