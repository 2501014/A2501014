import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);

        System.out.print("Dollar 개수 입력: ");
        int dollar = scnner.nextInt();

        System.out.print("half 개수 입력: ");
        int half = scnner.nextInt();

        System.out.print("quarter 개수 입력: ");
        int quarrer = scnner.nextInt();

        System.out.print("dime 개수 입력: ");
        int dime = scnner.nextInt();

        System.out.print("nickel 개수 입력: ");
        int nickel = scnner.nextInt();

        System.out.print("penny");
        int totalcents= (dollar*100)+(half*50)+(quarrer*25)+(dime*10)+(nickel*5);
    }
}