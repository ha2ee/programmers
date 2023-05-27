package intro;

import java.math.BigInteger;

public class 구슬을나누는경우의수 {

    public static void main(String[] args) {
        System.out.println(solution(3, 2));
    }

    public static int solution(int balls, int share) {
        int answer = 0;
        // int nm = 1;
        BigInteger nm = new BigInteger("1");
        for(int i = balls-share; i>0; i--){
            nm = nm.multiply(new BigInteger(String.valueOf(i)));
            // nm*=i;
        }
        
        // int m = 1;
        BigInteger m = new BigInteger("1");
        for(int i = share; i>0; i--){
            m = m.multiply(new BigInteger(String.valueOf(i)));
            // m*=i;
        }
        
        // int n = 1;
        BigInteger n = new BigInteger("1");
        for(int i = balls; i>0; i--){
            n = n.multiply(new BigInteger(String.valueOf(i)));
            // n*=i;
        }
        // answer = n/(nm*m);
        BigInteger a = n.divide(nm.multiply(m));
        answer = a.intValue();
        return answer;
    }
}
