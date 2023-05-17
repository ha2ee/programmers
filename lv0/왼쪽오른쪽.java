package lv0;

public class 왼쪽오른쪽 {
    public static void main(String[] args) {
        String[] str_list = {"r", "u", "l", "r"};
        String[] result = solution(str_list);
        for(String s : result){
            System.out.println(s);
        }

    }

    public static String[] solution(String[] str_list) {
        String[] answer = {};
        String[] tp = new String[str_list.length];
        int idx = 0;
        for(int i = 0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                for(int j = 0; j<i; j++){
                    tp[j] = str_list[j];
                    idx++;
                }
                break;
                
            } else if(str_list[i].equals("r")){
                for(int j = i+1; j<str_list.length; j++){
                    tp[idx] = str_list[j];
                    idx++;
                }
                break;
            }
            
        }
        if(tp[0] == null){
            return answer;
        }
        
        answer = new String[idx];
        for(int k = 0; k<idx; k++){
            answer[k] = tp[k];
        }
        return answer;
    }
}
