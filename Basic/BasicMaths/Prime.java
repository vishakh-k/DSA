package BasicMaths;

public class Prime {
     boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count=count+1;
                if(n/i!=i){
                    count=count+1;
                }
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Prime p = new Prime();
        boolean temp=p.isPrime(3);
        System.out.println(temp);  
    }
}
