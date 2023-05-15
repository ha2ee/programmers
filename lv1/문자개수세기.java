package lv1;

public class 문자개수세기 {
    public static void main(String[] args) {
        for(int i : solution("abcd")){
            System.out.println(i);
        }
    }   
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i<arr.length; i++) {
            int idx = arr[i] - 65;
            if(idx > 26){
                answer[idx-6] +=1;
                continue;
            }
            answer[idx] +=1;
        }
        return answer;
    }
}
