package intro;

public class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = 0;
        answer = String.valueOf(num).indexOf(String.valueOf(k));
        if(answer != -1) answer++;
        return answer;
    }
}
