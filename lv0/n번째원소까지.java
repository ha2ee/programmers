package lv0;

public class n번째원소까지 {
    public static void main(String[] args) {
        
    }
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        int idx = 0;
        for(int i = 0; i<n; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}
