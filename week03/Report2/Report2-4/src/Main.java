//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        System.out.print("원의 반지름을 입력하세요: ");
        int radius = sc.nextInt();

        double boxArea = 4.0 * radius * radius;
        double circlearea = Math.PI * radius * radius;

        double area = boxArea - circlearea;

        System.out.printf("정사각형(boxarea): %.2f\n", boxArea);
        System.out.printf("원의 면적(circleArea): %2.f\n", circlearea);
        System.out.printf("구하는 면적(area): %2.f\n", area);
    }
}