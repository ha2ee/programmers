package lv0;

import java.util.Arrays;

public class x사이의개수 {
    public static void main(String[] args) {
        
    }

    class Solution {
        public int[] solution(String myString) {
            String[] arr = myString.split("x",-1);
            
            int[] answer = Arrays.stream(arr)
                .mapToInt(String::length)
                .toArray();
            
            return answer;
        }
}
}
