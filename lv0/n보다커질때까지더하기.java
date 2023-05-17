package lv0;

public class n보다커질때까지더하기 {
    public static void main(String[] args) {
        
    }

    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int a : numbers){
            if(answer<=n){
                answer += a;
            }else {
                break;
            }
        }
        return answer;
    }
}
