import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("용도 선택 (1.가정용 2.영업용): ");
        int type = sc.nextInt();

        System.out.print("사용량(m3)입력: ");
        double usage = sc.nextDouble();

        int basicFee = 1200;
        int unitPrie;

        if(type ==1){
            unitPrie = 40;
        }else {
            System.out.println("잘못된 용도입니다");
            sc.close();
            return;
        }

        int usedAmount = (int) usage * unitPrie;

        int tax = (int) Math.round((basicFee + usedAmount)* 0.05);

        int total = basicFee + usedAmount + tax;

        System.out.println("기본료 : " + basicFee + "원");
        System.out.println("사용 금액 : " + usedAmount + "원");
        System.out.println("세금(5%) : " + tax + "원");
        System.out.println("납부 금액 : " + total + "원");

        sc.close();
    }
}