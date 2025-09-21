package BasicMaths;

public class Factorial {
    int factorial(int n) {
        // code here
        if(n<0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int res=f.factorial(3);
        System.out.println(res);
    }
}
