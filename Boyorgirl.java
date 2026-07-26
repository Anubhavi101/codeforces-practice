// Problem: https://codeforces.com/problemset/problem/236/A
// Date: 2026-07-26

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean[] seen = new boolean[26];
        int distinct = 0;

        for (char ch : s.toCharArray()) {
            int index = ch - 'a';

            if (!seen[index]) {
                seen[index] = true;
                distinct++;
            }
        }

        if (distinct % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}