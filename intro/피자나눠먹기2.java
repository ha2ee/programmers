package intro;

public class 피자나눠먹기2 {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 1;
        while(true){
            if(answer*6%n == 0){
                break;
            }
            answer++;
        }
        return answer;
    }
}
