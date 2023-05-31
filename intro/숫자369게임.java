package intro;

public class 숫자369게임 {
    public int solution(int order) {
        int answer = 0;
        String[] arr = String.valueOf(order).split("");
        for(String a : arr){
            if(Integer.parseInt(a)%3 == 0) answer++;
        }
        return answer;
    }
}
