package lv0;

import java.util.ArrayList;
import java.util.List;

public class 무작위로K개의수뽑기 {
    public static void main(String[] args) {
        
    }
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> intList = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            if(intList.indexOf(arr[i]) == -1){
                intList.add(arr[i]);
            } else {
                continue;
            }
        }
        if(intList.size() < k){
            for(int j = intList.size(); j<k; j++){
                intList.add(-1);
            }
        }
        
        answer = new int[k];
        for(int i = 0; i<k; i++){
            answer[i] = intList.get(i);
        }
        return answer;
        }
}
