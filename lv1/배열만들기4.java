package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class 배열만들기4 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        solution(arr);
    }
    public static int[] solution(int[] arr) {
        int[] stk ={};

        ArrayList<Integer> list = (ArrayList<Integer>)Arrays.stream(arr).boxed().collect(Collectors.toList());
        ArrayList<Integer> stkList = new ArrayList<>();
        for(int i = 0; i<list.size();) {
            if(stkList.isEmpty()){
                stkList.add(arr[i]);
                i++;
            } else if(!stkList.isEmpty() && stkList.get(stkList.size()-1) < arr[i]){
                stkList.add(arr[i]);
                i++;
            } else if(!stkList.isEmpty() && stkList.get(stkList.size()-1) >= arr[i]){
                stkList.remove(stkList.size()-1);
            }
        }
        stk = new int[stkList.size()];
        for(int i = 0; i<stkList.size(); i++) {
            stk[i] = stkList.get(i).intValue();
        }
        return stk;
    }
}
