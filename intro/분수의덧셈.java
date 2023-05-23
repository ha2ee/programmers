package intro;

public class 분수의덧셈 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int gcd = euclidean(denom2, denom1);
        int lcm = denom1*denom2/gcd;
        
        numer1 *= lcm/denom1;
        numer2 *= lcm/denom2;
        
        int sumNumer = numer1 + numer2;
        
        int gcdSum = euclidean(sumNumer, lcm);
        
        answer[0] = sumNumer / gcdSum;
        answer[1] = lcm / gcdSum;
        
            
        return answer;
    }
    
    public int euclidean(int a, int b){
        return  b == 0 ? a : euclidean(b, a%b);
    }
}
