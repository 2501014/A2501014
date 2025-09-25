import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        int won; //data
        float convert; //data
        float dollar; //정보

        System.out.printf("오늘의 환율 달러 입력: ");
        convert = keyborad.nextFloat();
        System.out.printf("얼마를 달러로 환전 할까요 ?");
        won = keyborad.nextInt();

        dollar = convert * won;

        System.out.printf("원화 %,d원은 %,f 달러($) 입니다.", won, dollar);
    }
}

