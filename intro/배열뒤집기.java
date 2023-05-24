package intro;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        int[] answer = num_list;
        int length = num_list.length;
        
        for(int i = 0; i<length/2; i++){
            int temp = num_list[i];
            num_list[i] = num_list[num_list.length-i-1];
            num_list[num_list.length-i-1] = temp;
        }
        return answer;
    }
}
