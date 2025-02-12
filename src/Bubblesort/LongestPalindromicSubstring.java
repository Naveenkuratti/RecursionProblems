package Bubblesort;

public class LongestPalindromicSubstring {
    int max = 0, start = 0, end = 0;

    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String findLongestPalindrome(String s) {
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {  // Start j from i
                if (isPalindrome(s, i, j)) {
                    if ((j - i + 1) > max) {
                        max = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
        String s = "babad";  // Example input
        System.out.println("Longest Palindromic Substring: " + obj.findLongestPalindrome(s));
    }
}
