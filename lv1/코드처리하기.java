package lv1;

public class 코드처리하기 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abc1abc1abc"));
    }

}

class Solution {
    public String solution(String code) {
        String[] arr = code.split("");
        StringBuffer ret = new StringBuffer();
        int mode = 0;            
        
        for(int idx=0; idx<arr.length; idx++) {
            if(mode == 0){
                if(!arr[idx].equals("1")){
                    if(idx % 2 == 0) {
                        ret.append(arr[idx]);
                    }
                } else {
                mode = 1;
            }
            } else if(mode == 1) {
                if(!arr[idx].equals("1")){
                    if(idx%2==1){
                        ret.append(arr[idx]);
                    }
                } else {
                mode = 0;
            }
            }
        }
        if(ret.length() == 0){
            return "EMPTY";
        }
        return ret.toString();
    }
}
