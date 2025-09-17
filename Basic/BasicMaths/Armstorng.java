package BasicMaths;

public class Armstorng {
    public boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        if (temp == sum)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Armstorng a= new Armstorng();
        boolean bol=a.armstrongNumber(154);
        System.out.println(bol);
    }
}