package intro;

public class k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int asd = i; asd<=j; asd++){
            String[] arr = String.valueOf(asd).split("");
            for(int qwe =0; qwe<arr.length; qwe++){
                if(arr[qwe].contains(String.valueOf(k))){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
