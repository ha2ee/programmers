package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 숫자2의영역 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int[] result = solution(arr);
        for(int i : result){
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int s = intList.indexOf(2);
        int e = intList.lastIndexOf(2);
        List<Integer> temp = new ArrayList<>();

        if(!intList.contains(2)) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        for(int i=s; i<=e;i++){
            temp.add(arr[i]);
        }
        answer = temp.stream().mapToInt(i -> i).toArray();
        return answer;
            
}
}