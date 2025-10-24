import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.printf("당신의 이름은 ?");
        String name = sc.nextLine();

        System.out.printf(name+"님의 가족은 몇 입니까 ? ");
        int familyCount = sc.nextInt();
        sc.nextLine();

        System.out.printf(name+"님의 가족은 어디에서 살지요 ? ");
        String city = sc.nextLine();

        System.out.println();
        System.out.println(name+"님의 가족은 " +familyCount+ "명 입니다.");
        System.out.println(name+"님의 가족은 " + city + "에서 살고 있습니다.");
    }
}