import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요");
        int age = sc.nextInt();

        System.out.print("교통카드를 사용하십니까? (y/n): ");
        char card = sc.next().charAt(0);

        System.out.print("탑승 시간을 입력하세요 (0~23시): ");
        int hour = sc.nextInt();

        int fare = 0; //기본 요금

        if (age >=19){ //성인
            fare = (card == 'y' || card == 'y')? 1250 : 1350;
        } else if (age >=13) { //청소년
            fare = (card == 'y' || card == 'y')? 750: 850;
        } else { //어린이
            fare = 450;
        }

        if (hour >=22 || hour <5) {
            fare = (int) (fare * 1.2); //20%추가
        }

        System.out.println("총 요금은 " + fare + "원 입니다.");

        sc.close();
        }
    }