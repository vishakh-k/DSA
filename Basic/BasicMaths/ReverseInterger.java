package BasicMaths;

public class ReverseInterger {
    public int reverseInt(int x) {
        int reverse = 0, lastDigit;
        while (x != 0) {
            lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseInterger r = new ReverseInterger();
        int res = r.reverseInt(-123456789);
        System.out.println(res);
    }
}
