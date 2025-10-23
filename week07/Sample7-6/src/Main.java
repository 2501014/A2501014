import java.io.FilterOutputStream;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        int A, B, C;
        String result;
        double S;
        double area;
        boolean flag = ture;

        System.out.print("삼각형의 세변의 길이 입력 : ");
        A = keyborad.nextInt();
        B = keyborad.nextInt();
        C = keyborad.nextInt();

        if ((A > 0 && B > 0 && C >  0) || (A+B > C && B +C > A && C + A > B)) {
            S = (A + B + C) / 2.0;
            area = Math.sqrt(S * (S-A) * (S-B) * (S-C));
            result = String.format("삼각형의 넓이 : %2.f \u33a0.",area);
        } else {
            result = "삼각형을 만들 수가 없습니다.";
            flag = false;
        }

        if (flag)
            System.out.printf("%s" , result);
        else
            System.err.printf("%s" ,result);
        System.out.printf("세변의 길이 %d cm, %d cm, %d cm이면%s\n",A,B,C ,result);
    }
}