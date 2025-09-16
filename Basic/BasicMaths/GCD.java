package BasicMaths;

public class GCD {
    public int findGCD(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            if(b>a){
                b=b-a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        GCD g= new GCD();
        int res= g.findGCD(1000, 50);
        System.out.println(res);
    }
}
