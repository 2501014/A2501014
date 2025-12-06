//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int purchaseprice = 1015000; //매입원가(원)
        double profirate = 0.30; //이익률(30%)
        double taxrate = 0.10; //세율(10%)

        double salesprice = purchaseprice * (1 + profirate);
        double slaesTax = salesprice * taxrate;
        double purchasetax = purchaseprice * taxrate;
        double payabletax = slaesTax - purchasetax;

        System.out.println("정가(판매가): " + salesprice + "원");
        System.out.println("매출 세액: " + slaesTax + "원");
        System.out.println("매입 세액: " + payabletax + "원");
        System.out.println("납부 세액: " + payabletax + " 원");

    }
}