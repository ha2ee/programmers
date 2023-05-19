package lv0;

import java.util.ArrayList;
import java.util.List;

public class 빈배열에추가삭제하기 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        solution(arr, flag);
    }

    public static int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> intList = new ArrayList<>();
        
        for(int i =0; i<arr.length; i++){
            if(flag[i]){
                for(int j = 0; j<arr[i]*2; j++){
                    intList.add(arr[i]);
                }
                
            } else {
                for(int j = 0; j<arr[i]; j++){
                    intList.remove(intList.size()-1);
                }
            }    
        }
        
        answer = new int[intList.size()];
        for(int i =0; i<intList.size(); i++){
            answer[i] = intList.get(i);
        }
        
        return answer;
    }
}
