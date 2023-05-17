package lv0;

public class n번째원소부터 {
    public static void main(String[] args) {
        
    }
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        
        for(int i = 0, j = n; j<=num_list.length; j++, i++){
            answer[i]=num_list[j-1];
        }
        return answer;
    }
}
