package BasicMaths;

public class Fibonacci {
   public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int res=f.fib(6);
        System.out.println(res);
    }
}
