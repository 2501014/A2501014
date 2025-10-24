import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("정사각형의 한 변의 길이를 입력하세요: ");
        double len = sc.nextDouble();

        double squareArea = len *len;
        double radius = len / 2;
        double circleArea = 3.14*radius*radius;
        double redarea = squareArea - circleArea;


        System.out.printf("정사각형의 면적: "+squareArea);
        System.out.printf("원의 면적: "+circleArea);
        System.out.printf("빨간 영역의 면적: "+redarea);

        sc.close();
    }
}