package lv0;

public class 문자열이몇번등장하는지세기 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
    }

    public static int solution(String myString, String pat) {
        int answer = 0;
        int index = myString.indexOf(pat);
        while (index >= 0) {
            answer++;
            index = myString.indexOf(pat, index + 1);
        }
        return answer;
    }
}
