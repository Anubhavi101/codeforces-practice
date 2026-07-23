// Problem: https://codeforces.com/problemset/problem/282/A
// Date: 2026-07-23

import java.util.Scanner;
public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
        sc.close();
    }
}