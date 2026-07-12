package TwoPointers;

public class Palindrome {

    // this method check only string
    public static boolean isPalindrome(Object value) {

        if (value == null) return false;

        String str = String.valueOf(value).toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.printf("Palindrome: %s%n", isPalindrome("MADAm"));
        System.out.printf("Palindrome: %s%n", isPalindrome(123454321));

    }
}
