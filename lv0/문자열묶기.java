package lv0;

import java.util.HashMap;
import java.util.Map;

public class 문자열묶기 {
    public static void main(String[] args) {
        
    }

    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        for(String str : strArr){
            int length = str.length();
            cnt.put(length, cnt.getOrDefault(length,0)+1);
        }
        
        for(int max : cnt.values()){
            answer = Math.max(answer,max);
        }
        
        return answer;
    }
}
