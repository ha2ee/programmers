package lv1;

public class 문자열여러번뒤집기 {
    public static void main(String[] args) {
        int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
        System.out.println(solution("rermgorpsam", queries));
    }

    public static String solution(String my_string, int[][] queries) {
        String[] temp = my_string.split("");
        for(int i = 0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            while(s < e) {
                String tp = temp[s];
                temp[s] = temp[e];
                temp[e] = tp;
                s++;
                e--;
            }
        }
        return String.join("",temp);
    }
}
