package lv0;

import java.util.Map;
import java.util.TreeMap;

public class 전국대회선발고사 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        System.out.println(solution(rank, attendance));
    }

    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;

        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i<rank.length; i++){
            if(attendance[i]){
                map.put(rank[i], i);
            }
        }

        int[] list = new int[3];
        int cnt = 0;

        for(int s : map.values()){
            list[cnt++] = s;
            if(cnt == 3){
                break;
            }
        }

        answer = 10000*list[0]+100*list[1]+list[2];
        return answer;
    }
}
