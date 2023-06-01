package intro;

import java.util.ArrayList;
import java.util.List;

public class n의배수고르기 {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int a : numlist){
            if(a%n == 0){
                list.add(a);
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
