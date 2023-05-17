package lv0;

public class n개간격의원소들 {
    public static void main(String[] args) {
        System.out.println(Math.ceil(6/4));
    }

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(int)Math.ceil((double)num_list.length/n)];
        for(int i = 0, j=0; j<answer.length; i+=n, j++){
            answer[j] = num_list[i];
        }
        return answer;
    }

}
