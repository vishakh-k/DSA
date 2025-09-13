package BasicMaths;

class countDigits {
    public int cDigits(int n) {
        int count=0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
        
       //another approach
       //String str=String.valueOf(n);
       //return str.length();
    }
    public static void main(String[] args) {
        countDigits c= new countDigits();
        int res=c.cDigits(12345);
        System.out.println(res);
    }
}
