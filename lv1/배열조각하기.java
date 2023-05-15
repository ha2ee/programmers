package lv1;

import java.util.Arrays;

public class 배열조각하기 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4,1,2};
        int[] result = solution(arr,query);
        for(int i : result){
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr, int[] query) {
        int idx = 0;
        for(int i : query){
            if(idx%2 == 0){
                arr = Arrays.copyOf(arr, i+1);
            } else {
                arr = Arrays.copyOfRange(arr, i,arr.length);
            }
            idx++;
        }
        return arr;
    }
}
