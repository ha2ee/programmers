package lv1;

public class 카운트업 {
    public static void main(String[] args) {
        
    }
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        int idx = 0;
        for(int i = start; i<=end; i++) {
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}
