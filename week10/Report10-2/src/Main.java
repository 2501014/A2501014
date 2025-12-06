import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] votes = new int[5];
        int invalid = 0;

        System.out.println("투표를 시작합니다 (1 ~ 4 : 후보 번호, 기타 숫자 : 무효표, 음수 입력 시 종료");

        while (true){
            System.out.print("후보 번호 입력(1~4) : ");
            int input = sc.nextInt();

            if(input <0){
                System.out.println("투표 종료!.");
                break;
            }
            if(1 <= input && input <= 4){
                votes[input]++;
            }else {

                invalid++;
            }
        }

        System.out.println("=====개표 결과======");
        for (int i = 1; i <= 4; i++){
            System.out.printf("후보 %d번: %d표\n", i, votes[i]);
        }
        System.out.printf("무효표: %d표\n", invalid);
    }
}