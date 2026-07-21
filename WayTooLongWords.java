// Problem: https://codeforces.com/problemset/problem/71/A
// Date: 2026-07-21

import java.util.*;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String word = sc.next();
            if (word.length() > 10) {
                int count = word.length() - 2;
                String ans = word.charAt(0) + String.valueOf(count) + word.charAt(word.length() - 1);
                System.out.println(ans);
            } else {
                System.out.println(word);
            }
        }
        sc.close();
    }
}