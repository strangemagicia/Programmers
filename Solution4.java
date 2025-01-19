//대문자는 소문자로, 소문자는 대문자로
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i); //문자열이 아니라 각 위치당 문자 하나를 빼서 판별
            if(Character.isUpperCase(c)) { //isUpperCase라는 함수가 있었다...
                answer += Character.toLowerCase(c);
            }
            else {
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}
