package baekjoon;
import java.util.Scanner;
public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //입력 값을 String 형 변수 sNum에 저장한 후 char[]형 변수로 변환 하기

        String sNum=sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i = 0; i< cNum.length;i++){
            sum+=cNum[i]-'0';
        }
        System.out.println(sum);
    }
}
