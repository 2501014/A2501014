//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int month = (500 * 10) + (100 * 10);

        int totalMonths = 30 * 12;

        int amount = month * totalMonths;

        System.out.println("한 달 저금액 = " + month + "원");
        System.out.println("총 저금 개월 수 = " + totalMonths + "개월");
        System.out.println("30년 동안의 총 저금액  = " + amount + "원");
    }
}