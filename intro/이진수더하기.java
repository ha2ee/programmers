package intro;

public class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int a = Integer.parseInt(bin1, 2);
        int b = Integer.parseInt(bin2, 2);
        answer = Integer.toBinaryString(a+b);
        return answer;
    }
}
