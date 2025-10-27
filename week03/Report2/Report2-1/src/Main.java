import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("나이 체중 신장을 분리하여 순서대로 입력하세요");
        int age = sc.nextInt();
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.printf("당신의 나이는 "+age+"살 입니다.");
        System.out.printf("당신의 체중은 "+weight+"kg입니다.");
        System.out.printf("당신의 신장은 "+height+"cm입니다.");
    }
}