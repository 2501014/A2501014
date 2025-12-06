import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vp = new int[5];
        int xdata;
        int N;

        System.out.print("총 투표 인원들 입력 : ");
        N = sc.nextInt();

        System.out.println("\n1 ~ 4 번 중 한 후보를 입력하시오");

        for (int i = 1; i <= N; i++){
            System.out.print(i + "번 투표자 : ");
            xdata = sc.nextInt();

            if (xdata >= 1 && xdata <= 4)
                ip[xdata]++;
            else
                ip[0]++;
        }

        System.out.println("\n투표 결과");
        System.out.println("후보 : 1 2 3 4 무효표");
        System.out.printf("득표수 : %d %d %d %d %d\n", ip[1], ip[2], ip[3], ip[4], ip[0]);

        System.out.println("\n총 튜표 인 수 : "  + N + "명");

        sc.close();
    }
}