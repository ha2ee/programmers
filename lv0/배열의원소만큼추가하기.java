package lv0;

import java.util.ArrayList;
import java.util.List;

public class 배열의원소만큼추가하기 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> intList = new ArrayList();

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i]; j++){
                intList.add(arr[i]);
            }
        }
        
        answer = new int[intList.size()];
        for(int i = 0, limit = intList.size(); i<limit; i++){
            answer[i] = intList.get(i);
        }
        return answer;
    }
}
