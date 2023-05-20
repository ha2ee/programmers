package lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열의원소삭제하기 {
    public static void main(String[] args) {
        
    }
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i = 0; i<delete_list.length; i++){
            if(intList.contains(Integer.valueOf(delete_list[i]))){
                intList.remove(Integer.valueOf(delete_list[i]));
            }
        }
        int[] answer = intList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}
