import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args)
    Scanner sc = new Scanner(System.in);

        System.out.printf("원의 반지름을 입력하세요: ");
    double r = sc.nextDouble();

    double squaraeaaaaaaaaArea =4*r*r;
    double circleArea = Math.PI*r*r;
    double redArea = squareArea - circleArea;

        System.out.printf("원의 반지름:%.1f\n",r);
        System.out.printf("정사각형의 면적 : %.0f Cm2\n",squareArea);
        System.out.printf("원의 면적 : %.2f Cm\n",circleArea);
        System.out.printf("구하는 면적: %.2f Cm2\n",redArea);c static void
    }
}