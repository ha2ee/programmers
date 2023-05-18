package lv0;

public class ad제거하기 {
    public static void main(String[] args) {
        
    }

    public String[] solution(String[] strArr) {
        String[] answer = {};
        int arrIdx = 0;
        int asnwerIdx = 0;
        
        for(String a : strArr){
            if(!a.contains("ad")){
                arrIdx++;
            }
        }
        
        answer = new String[arrIdx];
        
        for(String str : strArr){
            if(str.contains("ad")){
                continue;
            } else {
                answer[asnwerIdx] = str;
                asnwerIdx++;
            }
        }
        return answer;
    }
}
