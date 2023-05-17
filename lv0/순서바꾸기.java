package lv0;

import java.util.Arrays;
import java.util.stream.Stream;

public class 순서바꾸기 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int[] temp = new int[num_list.length];
        int[] temp2 = new int[n];
        temp = Arrays.copyOfRange(num_list, n, num_list.length);
        temp2 = Arrays.copyOfRange(num_list, 0, n);
        answer = Stream.of(temp, temp2).flatMapToInt(Arrays::stream).toArray();
        return answer;
    }
}
