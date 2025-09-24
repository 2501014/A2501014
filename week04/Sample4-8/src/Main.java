import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad=new Scanner(Systm.in);
        int salary,bonus;
        int total, tax;


        System.out.printf("월급 입력:");
        salary=keyborad.nextInt();
        System.out.printf("보너스 입력:");
        bonus=keyborad.nextInt();

        total=salary+bonus;
        tax=(int) (total*(8.0f/100));
        tax/=10;
        tax *=10;

        System.out.print("본봉은 %,d원\n",salary);
        System.out.print("보너스는 %d원\n",bonus);
        System.out.print("총 수입액=%d 원\n",:total);
        System.out.print("세금:%d원\n",tax);
        System.out.print("실 입금액=%d 원\n",total-tax);
    }
}