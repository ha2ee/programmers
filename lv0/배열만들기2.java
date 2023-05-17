package lv0;

public class 배열만들기2 {
    public static void main(String[] args) {
    int[] arr = solution(10, 20);
    for(int i : arr) {
        System.out.println(i);
    }
    }
    public static int[] solution(int l, int r) {
        int[] answer = {};
        int[] answertemp = new int[r-l];
        int idx = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = l; i<=r; i++) {
            String temp = "";
            temp = ""+i;
            String reg = "^[50]+$";
            if(temp.matches(reg)){
                sb.setLength(0);
                sb.append(temp);
                answertemp[idx] = Integer.parseInt(sb.toString());
                idx++;
            }
        }
        answer = new int[idx];
        for(int i =0; i<idx; i++) {
            answer[i] = answertemp[i];
        }
        if(sb.length() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
            return answer;
        }
}
