import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //반지름 입력
        System.out.print("구의 반지름을 입력하세요(정수): ");
        int r = sc.nextInt();

        // 상수
        double pi  = 3.141592;

        //부피와 표면적 계산
        double volume = (4.0/3.0 ) * r * r * r; //4/3 * pi
        double surfaceArea = 4 * pi * r * r; //4 * pi

        System.out.println("구의 부피: " + volume);
        System.out.println("구의 표면적: " + surfaceArea);
    }
}