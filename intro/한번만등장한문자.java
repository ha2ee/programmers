package intro;

import java.util.Arrays;

public class 한번만등장한문자 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        StringBuffer sb = new StringBuffer();
        int idx = 0;
        for(String a : arr){
            if(s.length() - s.replace(arr[idx],"").length() == 1){
                sb.append(a);
            }
            idx++;
        }
        arr = sb.toString().split("");
        Arrays.sort(arr);
        answer = String.join("",arr);
        return answer;
    }
}
