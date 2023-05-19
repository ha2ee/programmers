package lv0;

public class 문자열바꿔서찾기 {
    public static void main(String[] args) {
        
    }

    public int solution(String myString, String pat) {
        int answer = myString.replace("A","X")
            .replace("B","A")
            .replace("X","B")
            .contains(pat) ? 1:0;
        return answer;
    }
}
