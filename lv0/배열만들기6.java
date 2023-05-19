package lv0;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기6 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        List<Integer> intList = new ArrayList<>();
        while(i<arr.length){
            
            if(intList.size() == 0){
                intList.add(arr[i]);
                i++;
            } else if(intList.lastIndexOf(arr[i]) == intList.size()-1){
                intList.remove(intList.size()-1);
                i++;
            } else if(intList.lastIndexOf(arr[i]) != intList.size()-1){
                intList.add(arr[i]);
                i++;
            }
        }
        
        if(intList.size() == 0 ){
            return new int[]{-1};
        }
        answer = new int[intList.size()];
        for(int j = 0; j<intList.size(); j++){
            answer[j] = intList.get(j);
        }
        return answer;
    }
}
