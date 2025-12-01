//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int coin500 = 10;
        int coin100 = 10;

        int montylySaving = (coin500 * 500) + (coin100 * 100);

        int totalMonths = 30 * 12;

        int totalSaving = montylySaving * totalMonths;

        System.out.println("30년간 총 저금액: " + totalSaving + "원");

    }
}