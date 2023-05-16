package lv1;

public class 할일목록 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
    }

    public String[] solution(String[] todo_list, boolean[] finished) {
        int idx = 0;
        for(boolean b : finished){
            if(!b){
                idx++;
            }
        }
        
        String[] answer = new String[idx];

        for(int i = 0, j = 0; i<finished.length; i++){
            if(!finished[i]) {
                answer[j] = todo_list[i];
                j++;
            }
        }
        return answer;
    }
}
