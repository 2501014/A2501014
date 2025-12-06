import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int base; //삼각형의 밑변
        int height; //삼각형의 높이
        float area;
        Scanner keyborad = new Scanner(System.in);

        System.out.printf("삽각형의 밑변은?" );
        base = keyborad.nextInt();
        System.out.print("삼각형의 높이? ");
        height = keyborad.nextInt();

        area = base * height /2.0f;

        System.out.printf("밑변 %dCm, 높이 %dCm", base,height);
        System.out.printf("인 삼각형 넓이 = %.2fWn", area);
    }
}