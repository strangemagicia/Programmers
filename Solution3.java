//문자열 str을 n번 반복하여 출력하기
import java.util.Scanner;
public class Solution3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++){
      System.out.print(str);
      //println은 줄바꿈, print는 줄바꿈 없음
    }
  }
}
