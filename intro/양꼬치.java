package intro;

public class 양꼬치 {
    public int solution(int n, int k) {
        int answer = 0;
        
        int q = 12000;
        int w = 2000;
        
        k -= n/10;
        
        answer = q*n + k*w;
        
        return answer;
    }
}
