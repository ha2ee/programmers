package lv1;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기3 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> intList = new ArrayList<>();
        for(int[] queries : intervals){
            int s = queries[0];
            int e = queries[1];
            for(int i = s; i<=e; i++){
                intList.add(arr[i]);
            }
        }
        answer = intList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
