import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final  int BASIC_FEE = 1200;

        for (int i = 0; i < 10; i++){
            System.out.println("\n=====" + (i + 1) + "번째 사용자 정보 입력 =====");

            System.out.print("사용자 번호(4자리): ");
            String userId = sc.next();

            System.out.print("수도 구분 코드(1~5): ");
            int code = sc.nextInt();

            System.out.print("사용량(0.0 ~ ?, 소수점 1자리): ");
            double usage = sc.nextDouble();

            usage = Math.round(usage * 10) / 10.0;

            int bill = BASIC_FEE;

            switch (code){
                case 1:
                  bill += 100;
                  break;
                case 2:
                    bill += 200;
                    break;
                case 3:
                     bill += 300;
                     break;
                case 4:
                    bill += 400;
                    break;
                case 5:
                    bill += 500;
                    break;
                default:
                    System.out.println("잘못된 코드입니다");
                    continue;
            }

            System.out.println("\n--- 계산 결과 ---");
            System.out.println("사용자 번호: " + userId);
            System.out.println("수도 구분 코드: " + code);
            System.out.println("사용량: " + usage + "톤");
            System.out.println("수도 요금: " + bill + "원");
        }

        sc.close();
    }
}