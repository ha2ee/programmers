package intro;

public class 저주의숫자3 {
    public static void main(String[] args) {
        System.out.println(solution(25));
    }   

    public static int solution(int n) {
        int answer = 0;
        int idx = 1;
        while(idx<100){
            if(idx%3 == 0 || String.valueOf(idx).contains("3")){
                answer++;
                continue;
            }
            answer++;
            idx++;
        }
        return answer;
    }
}
