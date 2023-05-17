package lv0;

public class A강조하기 {
    public static void main(String[] args) {
        
    }
    public String solution(String myString) {
        String answer = "";
        char[] c = myString.toCharArray();
        for(int i = 0; i<c.length; i++){
            if(c[i] == 'a' || c[i] == 'A'){
                c[i] = 'A';
            } else if(Character.isUpperCase(c[i])) {
                c[i] = Character.toLowerCase(c[i]);
            }
        }
        return new String(c);
}
}
