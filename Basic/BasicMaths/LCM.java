package BasicMaths;

public class LCM {
     public int findLCM(int a, int b){
        int gcd=0;
        int x=a;
        int y=b;
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            if(b>a){
                b=b-a;
            }
        }
        gcd=a;
        int lcm=x*y/gcd;
        return lcm;
    }

    public static void main(String[] args) {
        LCM g= new LCM();
        int res= g.findLCM(2, 15);
        System.out.println(res);
    }
}
