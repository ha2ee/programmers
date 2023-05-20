package lv0;

public class 부분문자열인지확인하기 {
    public static void main(String[] args) {
        
    }

    public int solution(String my_string, String target) {
        int answer = my_string.contains(target) ? 1 : 0;
        return answer;
    }
}
