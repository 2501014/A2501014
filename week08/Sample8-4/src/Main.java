import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        int base, height;

        System.out.println("****삼각형의 넓이 구히기 ****");
        System.out.print("밑변 : ");
        base = keyborad.nextInt();
        System.out.print("높이 : ");
        height = keyborad.nextInt();

        double area  = ((double) base * height) /2;

        System.out.printf("넓이 : %.2f 쪄33A0", area);
    }
}