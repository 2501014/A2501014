import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int liter, priceperliter;
        double total, discounrate = 0.0, discountamount, discountertotal, vat, finalprice;

        System.out.print("주유술 리터 수를 입력하세요: ");
        liter = keyborad.nextInt();

        total = liter * priceperliter;

        if (total >= 50000) { //총 금액이 5만원 이상이면
            discounrate = 0.07; // 7%할인
        }

        discountamount = total * discounrate;
        discountertotal = total - discountamount;
        vat = discountertotal * 0.10; //부가세 10%
        finalprice = discountertotal + vat;

        System.out.print("%n 주유 리터 수 : %,10dl", liter);
        System.out.print("%n리터당 가격 : %,10d원", priceperliter);
        System.out.print("%n총 금액 : %,10.0f원", total);
        System.out.print("%n할인율 :  %,10.0f%%", discounrate * 100);
        System.out.print("%n할인 금액 : %,10.0f원", discountamount);
        System.out.print("%n할인 후 금액 : %10.0f원", discountertotal);
        System.out.print("%n부가세(10%) :  %10.0f원", vat);
        System.out.print("%n결제 금액 : %,10.0원%n", finalprice);

        keyborad.close();
    }
}