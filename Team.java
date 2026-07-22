// Problem: https://codeforces.com/problemset/problem/231/A
// Date: 2026-07-22

import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();
            if (petya + vasya + tonya >= 2) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}