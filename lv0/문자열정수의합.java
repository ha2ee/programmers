package lv0;

public class 문자열정수의합 {
    public int solution(String num_str) {
        int answer = 0;
        for(String str : num_str.split("")){
            answer+=Integer.parseInt(str);
        }
        return answer;
    }
}
