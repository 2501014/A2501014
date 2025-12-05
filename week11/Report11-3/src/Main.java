import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int BASIC_FEE = 1200;
        final int COUNT = 10;

        int[] pric = {0, 40, 55, 78, 35, 20};
        String[] type = {"", "가정용", "영업용", "공장용", "관공세", "군기관"};

        System.out.println("===== 수도 요금 계산 프로그램 =====");

        for (int i = 0; i < COUNT; i++){

            System.out.println("\n----- " + (i + 1) + "번째 사용자 -----");

            System.out.print("사용자 번호(4자리): ");
            String userId = sc.next();

            System.out.println("수도 구분 코드(1~5): ");
            int code = sc.nextInt();

            if (code < 1 || code > 5){
                System.out.println("잘못된 코드입니다 다시 입력하세요");
                i--;
                continue;
            }

            System.out.print("사용량(m3) 입력(예 : 12.3): ");
            double usage = sc.nextDouble();

            usage = Math.round(usage * 10) / 10.0;

            int bill = BASIC_FEE + (int) (usage * pric[code]);

            System.out.println("\n 계산 결과");
            System.out.println("사용자 번호: " + userId);
            System.out.println("수도 구분: " + type[code] + " (" + code + ")");
            System.out.println("사용량: " + usage + "m3");
            System.out.println("단가: " + pric[code] + "원");
            System.out.println("수도 요금: " + bill + "원");
        }

        sc.close();
    }
}