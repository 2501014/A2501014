import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ip = new int[4];

        int nogood = 0;

        int xdata;
        int total = 0;

        System.out.println("투표 프로그램 실행");
        System.out.println("1 ~ 4 번 중 한 후보의 번호를  입력(종료: 0");

        while (true){
            System.out.print("번호 입력 : ");
            xdata = sc.nextInt();

            if(xdata == 0) break;

            if(xdata >= 1 && xdata <= 4){
                ip[xdata - 1]++;
            }

            else {
                nogood++;
            }

            total++;
        }

        System.out.println("\n ===== 투표 결과 =====");
        System.out.println("1번 후보 : " + ip[0] + "표");
        System.out.println("2번 후보 : " + ip[1] + "표");
        System.out.println("3번 후보 : " + ip[2] + "표");
        System.out.println("4번 후보 : " + ip[3] + "표");
        System.out.println("무효표 : " + nogood + "표");
        System.out.println("--------------------------");
        System.out.println("총 투쵸수 : " + total + "표");
    }
}