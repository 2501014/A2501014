import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]ip = new int[4];
        int invalid = 0;
        int total = 0;

        System.out.println("투표 번호 입력(1 ~ 4 종료는 0)");
        int data = sc.nextInt();

        while (data != 0){

            if(data >= 1 && data <= 4){
            }else{

            }

            System.out.println("투표 번호 입력(1 ~ 4, 종료는 0); ");
            data = sc.nextInt();
        }

        for(int i = 0; i < ip.length; i++){
            System.out.println((i + 1) + "번 후보 투표 수: " + ip[i]);
        }
        System.out.println("무효표 수: " + invalid);
        System.out.println("총 투표수: " + total);

        sc.close();
    }
    }

