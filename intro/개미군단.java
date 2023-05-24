package intro;

public class 개미군단 {
    public int solution(int hp) {
        int answer = 0;
        int[] arr = {5,3,1};
        for(int i : arr){
            answer += hp/i;
            hp%=i;
        }
        return answer;
    }
}
