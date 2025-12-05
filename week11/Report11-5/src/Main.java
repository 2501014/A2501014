import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int BASIC_FEE = 1200;

        int[] unitPrice = {0, 40, 55, 78, 35, 20};

        double[] taxRate = {0.0, 0.05, 0.035, 0.025, 0.015, 0.0};
        String[] typeName = {"", "가정용", "영업용", "공장용", "관공서", "군기관" };

        System.out.println("===== 수도 요금 + 세금 계산 프로그램 =====");

        for (int i = 0; i < 3; i++){
            System.out.println("\n>> 번째  입력 <<");

            System.out.print("번호 입력: ");
            String id = sc.next();

            System.out.print("구분(1 ~ 5): ");
            int code = sc.nextInt();

            System.out.print("사용량(m3): ");
            double usage = sc.nextDouble();

            System.out.printf("이름 입력: ");
            String name = sc.next();

            System.out.printf("구분(1 ~ 5): ");
            int  code = sc.nextInt();

            System.out.printf("사용량(m3): ");
            double usage = sc.nextDouble();

            double usageFee = usage * unitPrice[code];

            double rawTax = (BASIC_FEE + usageFee) * taxRate[code];

            double rawTax = (BASIC_FEE + usagFee) * taxRate[code];
            int tax = (int)(rawTax / 10) * 10;

            int total = BASIC_FEE + (int)usagFee + tax;

            System.out.println("-----결과-----");
            System.out.println("번호 : " + id);
            System.out.println("이름: " + name);
            System.out.println("구분: " + typeName[code] + "(" + code + ")");
            System.out.printf("기본료: %d 원\n", BASIC_FEE);
            System.out.printf("사용 요금 : %.0f원 (단가 %d 원/m3)\n", usagFee, unitPrice[code]);
            System.out.printf("세금 : %d원 (세율 %.1f%%)\n", tax, taxRate[code] * 100);
            System.out.printf(" 총 납부액 : %d원\n", total);
        }
        sc.close();

    }
}