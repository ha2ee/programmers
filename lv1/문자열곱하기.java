package lv1;

public class 문자열곱하기 {
    public static void main(String[] args) {
        
    }

    public String solution(String my_string, int k) {
        String answer = "";
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i<k; i ++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}
