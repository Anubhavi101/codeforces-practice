// Problem: https://codeforces.com/problemset/problem/118/A
// Date: 2026-07-29

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'o' || ch == 'y' ||
                ch == 'e' || ch == 'u' || ch == 'i') {
                continue;
            }

            // Add '.' before every consonant
            result.append('.');
            result.append(ch);
        }

        System.out.println(result);
    }
}