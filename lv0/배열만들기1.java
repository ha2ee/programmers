package lv0;

public class 배열만들기1 {
    public static void main(String[] args) {
        
    }
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int idx = 0;
        for(int i = 1; i<=n; i++) {
            if(i%k ==0) {
                answer[idx] = i; 
                idx++;
            }
        }
        return answer;
    }
}
