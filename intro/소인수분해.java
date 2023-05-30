package intro;

import java.util.ArrayList;
import java.util.List;

public class 소인수분해 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    public static int[] solution(int n) {
        int idx = 2;
        List<Integer> list = new ArrayList<>();
        while(true){
            if(n%idx == 0) {
                list.add(idx);
                n = n/idx;
                idx = 2;
            } else {
                idx++;
            }
            if(n == 1){
                break;
            }
        }
        int[] answer = list.stream().distinct().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
