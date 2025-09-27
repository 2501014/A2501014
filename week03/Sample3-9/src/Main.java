import  java.util..Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyborad = new Scanner(System.in);
        String name = "양준혁";
        int bat = 0;
        int hit = 0;
        float avg =0.0f;

        System.out.printf("오늘의 타수 입력 : ");
        bat = keyborad.nextFloat();
        System.out.printf("오늘의 안타수 입력 : ");
        hit = keyborad.nextInt();

        avg = (float) hit / bat;

        System.out.printf("\n선수 이름 : %s\n",name);
        System.out.printf("오늘의 타수 : %d\n",bat);
        System.out.printf("오늘의 안타수 :%d\n",hit);
        System.out.printf("오늘의 타율 : %.2f\n",avg);
    }
}