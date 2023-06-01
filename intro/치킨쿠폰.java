package intro;

public class 치킨쿠폰 {
    public static void main(String[] args) {
        System.out.println(solution(1081));
    }

    public static int solution(int chicken) {
        int answer = 1;
        int mod = 0;
        int div = 0;
        while(true){
            div = chicken/10;
            mod = chicken%10;
            answer += div;
            chicken = div+mod;
            if(div == 0) break;
        }
        return answer;
    }
}
