import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        int num1, num2;
        float result;

        System.out.print("분자, 분모 입력 : ");
        num1 = keyborad.nextInt();
        num2 = keyborad.nextInt();

        float temp = num2 == 0 ? 0.0f : 1;
        (String) temp = temp == 0 ? "ERROR : 분모가 0이면 안됩니다." :
                String.format("%d / %d = %2.f\n", num1, num2, temp);

        if (result == 0.0) {
            float result = (float) num1 / num2;
            System.out.printf("%d / %d = %2.f\n", num1, num2, result);
            System.err.println("ERROR : 분모가 0이면 안 됩니다.");
        } else {

            System.out.printf("%d / %d = %.2f\n", num1, num2, temp);
        }
    }
}
