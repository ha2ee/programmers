package intro;

public class 유한소수판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(12, 21));
    }
    public static int solution(int a, int b) {
        int answer = 0;
        int euc = euclidean(a,b);
        int denominator = b/euc;
        int cnt = 0;

        while(denominator % 2 == 0){
            denominator /= 2;
        }

        while(denominator % 5 == 0){
            denominator /= 5;
        }

        if(denominator == 1){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
    
    public static int euclidean(int a, int b) {
    if(b == 0){
        return a;
    }
    return euclidean(b, a%b);
}
}
