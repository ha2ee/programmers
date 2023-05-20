package lv0;

import java.math.BigInteger;

public class 두수의합 {
    public static void main(String[] args) {
        
    }

    public String solution(String a, String b) {
        String answer = String.valueOf(new BigInteger(a).add(new BigInteger(b)));
        return answer;
    }
}
