// Problem: https://codeforces.com/problemset/problem/431/A
// Date: 2026-08-03

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] calories = new int[5]; // Index 1 to 4

        for (int i = 1; i <= 4; i++) {
            calories[i] = sc.nextInt();
        }

        String s = sc.next();

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int strip = s.charAt(i) - '0';
            total += calories[strip];
        }

        System.out.println(total);

        sc.close();
    }
}