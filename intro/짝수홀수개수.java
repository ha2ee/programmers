package intro;

import java.util.Arrays;

public class 짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int even,odd;
        
        even =(int)Arrays.stream(num_list).filter(i -> i%2 == 0).count();
        odd = num_list.length - even;
        
        int[] answer = new int[]{even,odd};
        
        return answer;
    }
}
