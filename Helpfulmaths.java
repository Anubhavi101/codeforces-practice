// Problem: https://codeforces.com/problemset/problem/339/A
// Date: 2026-07-26

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int ones = 0;
        int twos = 0;
        int threes = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                ones++;
            } else if (ch == '2') {
                twos++;
            } else if (ch == '3') {
                threes++;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ones; i++) {
            result.append("1+");
        }

        for (int i = 0; i < twos; i++) {
            result.append("2+");
        }

        for (int i = 0; i < threes; i++) {
            result.append("3+");
        }

        // Remove the last '+'
        result.deleteCharAt(result.length() - 1);

        System.out.println(result);
    }
}