package BasicMaths;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0, lastDigit;
        while (x > 0) {
            lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        if (temp == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        boolean temp = p.isPalindrome(123);
        System.out.println(temp);
    }
}
