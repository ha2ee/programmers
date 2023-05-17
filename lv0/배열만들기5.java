package lv0;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기5 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int[] result = solution(intStrs, 50000, 5, 5);
        for(int i : result) {
            System.out.println(i);
        }
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> resultList = new ArrayList<>();
        for (String intStr : intStrs) {
            String subStr = intStr.substring(s, s + l);
            int num = Integer.parseInt(subStr); 
            if (num > k) { 
                resultList.add(num); 
            }
        }
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i); 
        }
        return answer;
    }
}
