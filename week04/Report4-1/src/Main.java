import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주문자 이름: ");
        String Name = sc.nextLine();

        System.out.print("모니터 크기: ");
        double Moni = sc.nextDouble();

        System.out.print("CPU클럭(GHz): ");
        double CIk = sc.nextDouble();

        System.out.printf("하드디스크 용량(GB): ");
        int Hdd = sc.nextDouble();
        sc.nextInt(); //줄바꿈 처리

        System.out.print("기타: ");
        String Etc = sc.nextLine();

        System.out.println("\n === 주문 정보===");
        System.out.println("주문자: "+Name);
        System.out.println("모니터: "+Moni+ "cm");
        System.out.println("CPU클럭: " + Clk + "GHz");
        System.out.println("하드디스크: "+Hdd+"GB");
        System.out.println("기타:"+Etc);
    }
}