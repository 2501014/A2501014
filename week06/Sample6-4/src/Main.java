import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        int degree;
        float result;


        System.out.print("섭씨온도 입력 : ");
        degree = keyborad.nextInt();

        result = (float) degree * 9 / 5+32;


        System.out.printf("섭씨 온도 %d\u2103는 화씨온도로 %2.f \2109 입니다.\n",
    }
}