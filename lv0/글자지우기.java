package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 글자지우기 {
    public static void main(String[] args) {
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(solution("apporoograpemmemprs", indices));
    }

    public static String solution(String my_string, int[] indices) {
        String answer = "";
        List<String> strList = new ArrayList<>(Arrays.asList(my_string.split("")));
        List<Integer> intList =  Arrays.stream(indices)
            .boxed()
            .collect(Collectors.toList());
        intList.sort(Collections.reverseOrder());
        for(int i : intList){
            strList.remove(i);
        }
        for(String s : strList){
            answer += s;
        }
        return answer;
    }
}
