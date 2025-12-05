import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int id;
        String name;
        int type;
        int usage;
        int bill = 0;

        System.out.print("수용가 번호 입력: ");
        id = sc.nextInt();

        System.out.print("이름 입력: ");
        name = sc.next();

        System.out.print("수도 구분 입력(1: 가정용, 2: 업무용, 3: 공업용: ");
        type = sc.nextInt();

        System.out.print("사용량 입력: ");
        usage = sc.nextInt();

        switch (type){
            case 1:
                bill = usage * 100;
                break;

            case 2 :
                bill = usage * 200;
                break;

            case 3 :
                bill = usage * 300;
                break;

            default:
                System.out.println("잘못된 수도 구분입니다");
                return;
        }

        System.out.println("\n===== 수도 요금 계산 결과 =====");
        System.out.println("수용가 번호: " + id);
        System.out.println("이름 " + name);
        System.out.println("수도 구분: " + type);
        System.out.println("사용량: " + usage + "톤");
        System.out.println("수도 요금: " + bill + "원");

        sc.close();
    }
}