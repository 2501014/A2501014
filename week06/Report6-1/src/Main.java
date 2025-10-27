import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);

        int count;
        int price = 3500;
        double discountrate = 0.0;
        double total, discountamount, finalprice;

        System.out.print("구매할 수 있는 식권 개수를 입력하세요 : ");
        count = keyborad.nextInt();

        if (count >= 30) {
            discountrate = 0.20;
        } else if (count >= 20){
            discountrate = 0.15;
        } else if (count = 10) {
            discountrate = 0.10;
        } else {
            discountrate = 0.0;
        }

        total = count * price;
        discountamount = total * discountrate;
        finalprice = total - discountamount;

        System.out.printf("%n 식권 개수 : %,100장", count);
        System.out.printf("%n 식권 1장 가격 : %,100원", price);
        System.out.printf("%n총 금액 : %,10.0f원", total);
        System.out.printf("%n할인율 : %,10.0f%%", discountrate * 100);
        System.out.printf("%n할인 금액 : %,10.0f", discountamount);
        System.out.printf("%n결제 금액 : %10.0f원%%n", finalprice);

        keyborad.close();
    }
}