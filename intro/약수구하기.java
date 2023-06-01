package intro;

import java.util.ArrayList;
import java.util.List;

public class 약수구하기 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
