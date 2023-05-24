package intro;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 최빈값구하기 {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4,4,4,4};
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        int answer = 0;
        int[] max = Arrays.stream(array).distinct().toArray();
        int[] cnt = new int[max.length];

        for(int i = 0; i<max.length; i++){
            for(int j = 0; j<array.length;j++){
                if(max[i] == array[j]){
                    cnt[i]++;
                }
            }
        }

        List<Integer> cntList = Arrays.stream(cnt).boxed().collect(Collectors.toList());
        int maxVal = Collections.max(cntList);
        int dupl = Collections.frequency(cntList, maxVal);

        if(dupl > 1){
            return -1;
        }

        int maxIdx = cntList.indexOf(maxVal);

        answer = max[maxIdx];
        return answer;
    }
}
