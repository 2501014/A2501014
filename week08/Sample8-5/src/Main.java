import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = keyborad.nextInt();

        String fare = (age >= 18) ? "4000원"
                : (age >= 13) ? "3000원"
                : (age >= 7) ? "1000원"
                : "무료";

        System.out.println("입장료: " + fare);
    }
}