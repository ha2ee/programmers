package intro;

public class 공던지기 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 1;
        for(int i = 0; i<k-1; i++){
            cnt+=2;
            if(cnt > numbers.length){
                cnt = cnt-numbers.length;
            }
            
        }
        answer = cnt;
        return answer;
    }
}
