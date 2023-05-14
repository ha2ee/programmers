package lv1;

public class qrcode {
    public static void main(String[] args) {
        
    }

    public String solution(int q, int r, String code) {
        String answer = "";
        String[] arr = code.split("");
        for(int i = 0; i<code.length(); i++ ) {
            if(i % q == r) {
                answer += arr[i];
            }
        }
        return answer;
    }
}
