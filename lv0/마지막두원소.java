package lv0;

public class 마지막두원소 {
    public static void main(String[] args) {
        
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        int a = num_list.length-1;
        int b = num_list.length-2;
        if(answer[a] > answer[b]) {
            answer[num_list.length] = answer[a] - answer[b];
        } else {
            answer[num_list.length] = answer[a]*2;
        }
        return answer;
    }
}
