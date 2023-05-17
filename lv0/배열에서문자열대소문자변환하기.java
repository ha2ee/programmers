package lv0;

import java.util.stream.IntStream;

public class 배열에서문자열대소문자변환하기 {
    public static void main(String[] args) {
        
    }

    public String[] solution(String[] strArr) {
        String[] answer = IntStream.range(0, strArr.length)
            .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
            .toArray(size -> new String[size]);
        
        return answer;
    }
}
