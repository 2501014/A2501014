import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyborad = new Scanner(System.in);
        int salary, expeness;
        float saveRate;
        int save, remain, money;

        System.out.print("월급을 입력하세요(원) :");
        salary = keyborad.nextInt();
        System.out.print("저축 비용을 입력하세요(예:0.2은 20%) :");
        saveRate = keyborad.nextFloat();
        System.out.print("월 지출 총액을 입력하세요 (원):");
        expeness = keyborad.nextInt();

        save = (int) (salary * saveRate);
        remain = salary - (save + expeness);
        money = remain / 30;

        System.out.println("[예산 계산 결과]");
        System.out.println("월급:%,d원\n", salary);
        System.out.println("저축액:%,d원\n", save);
        System.out.println("지출액:%d,원\n",expenses);
        System.out.println("남은 금액:%d원\n", remain);
        System.out.println("일일 사용 가능 예산 :%,d원\n", money);
    }
}