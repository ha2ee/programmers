package intro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 진료순서정하기 {
    public static void main(String[] args) {
        int[] arr = {3, 76, 24};
        solution(arr);
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> intList = Arrays.stream(emergency).sorted().boxed().collect(Collectors.toList()); // 3,76,24
        int[] reverse = intList.stream().sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();
        List<Integer> reList = Arrays.stream(reverse).boxed().collect(Collectors.toList());
        
        int idx = 0;
        for(int i : emergency){
            answer[idx] = reList.indexOf(i)+1;
            idx++;
        }
        return answer;
    }
}
