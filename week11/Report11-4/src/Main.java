import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        final int BASIC_FEE = 1200;

        int[] unitPrice = {0, 40, 55, 78, 35, 20};

        double[] taxRate = {0.0, 0.05, 0.035, 0.025, 0.015, 0.0};
        String[] typeName = {"", "가정용", "영업용", "공장용", "관공서", "군기관" };

        System.out.println("===== 수도 요금 + 세금 계산 프로그램 =====");

        for (int i = 1; i <= 10; i++){
            System.out.println("\n>> " + i +  "번째 사용자 입력 <<");

            System.out.println("사용자 번호 (4자리): ");
            String userId = sc.next();

            System.out.println("수도 구분 코드 (1 ~ 5): ");
            int code = sc.nextInt();

            if(code < 1 || code > 5){
                System.out.println(">>> 잘못된 코드입니다. 다시 입력하세요");
                i--;
                continue;
            }

            System.out.print("사용량(m3, 소수점 한 자리 허용): ");
            double usage = sc.nextDouble();

            double usageFee = usage * unitPrice[code];

            double rawTax = (BASIC_FEE + usageFee) * taxRate[code];

            int tax = (int)(rawTax / 10) * 10;

            int totalBill = BASIC_FEE + (int) usageFee + tax;

            System.out.println("----- 청구 내역 -----");
            System.out.println("사용자 번호 : " + userId);
            System.out.println("수도 구분  :  " + typeName[code] + " (" + code + ")");
            System.out.printf("기본료 : %d 원\n", BASIC_FEE);
            System.out.printf("사용 요금 : %.0f원 (단가 %d 원/m3, 사용량: %.1f m3)\n",
                    usageFee, unitPrice[code], usage);
            System.out.printf("세금 : %d원 (세율: %.1f%%)\n",
                    tax, taxRate[code]*100);
            System.out.printf("총 납부액 : %d원\n", totalBill);
            }

        sc.close();
    }
}