package BasicMaths;

public class SumOfNNumbers {
    public int sumNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfNNumbers s = new SumOfNNumbers();
        int res=s.sumNumbers(5);
        System.out.println(res);
    }
}
