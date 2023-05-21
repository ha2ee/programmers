package lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 정수찾기 {
    public static void main(String[] args) {
        
    }
    public int solution(int[] num_list, int n) {
        int answer = 0;
        List<Integer> intList = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        answer = intList.contains(n)?1:0;
        return answer;
    }
}
