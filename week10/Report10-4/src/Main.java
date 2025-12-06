import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] votes = new int[5];

        while (true){
            System.out.print("투표할 번호를 입력하세요 (입력 종료: 숫자 외 입력): ");

            if(!sc.hasNextInt()){
                break;
            }

            int num = sc.nextInt();

            if(num >= 1 && num <= 4){
                votes[num]++;
            }else {
                votes[0]++;
            }
        }

        sc.close();
    }
}