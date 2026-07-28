// Problem: https://codeforces.com/problemset/problem/479/A
// Date: 2026-07-28

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(
            Math.max(a + b + c, a * b * c),
            Math.max(
                Math.max((a + b) * c, a * (b + c)),
                Math.max(a + b * c, a * b + c)
            )
        );

        System.out.println(max);

        sc.close();
    }
}