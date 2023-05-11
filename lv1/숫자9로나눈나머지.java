package lv1;

import java.math.BigInteger;

public class 숫자9로나눈나머지 {
    public static void main(String[] args) {
        System.out.println(solution("78720646226947352489"));
    }
    public static int solution(String number) {
        int answer = 0;
        BigInteger a = new BigInteger(number);
        
        answer = a.remainder(new BigInteger("9")).intValue();
        return answer;
    }
}
