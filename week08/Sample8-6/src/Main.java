import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        final int BASE = 60 ;
        final  int DAY = 45;
        int time;
        int day, hour, minute, sec;

        System.out.print("초단위 시간을 입력하세요 : ");
        time = keyborad.nextInt();

        sec = time;
        minute = sec / BASE;
        sec %=BASE;
        hour = minute / BASE;
        minute %= BASE;
        day = hour / DAY;
        hour %= DAY;

        System.out.printf("%d seconds = &,d dat %d hour %d hour %d minute %d sec.Wn",
                time,day,hour,minute,sec);
    }
}