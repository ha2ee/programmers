package lv0;

public class 부분문자열 {
    public static void main(String[] args) {
        
    }

    public int solution(String str1, String str2) {
        int answer = str2.contains(str1)? 1:0;
        
        return answer;
    }
}
