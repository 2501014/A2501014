//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int SPEED = 300000;
        final float YEAR = 365.25f;
        long light = 0L;
        double light1 = 0.0;

        light = SPEED*(((YEAR*24)*60)*60);



        System.out.print("빛이 1초 동안 나는 거리 : %,d km/s\n", SPEED);
        System.out.print("1년은 %.2f 일\"n:%d일\n",YEAR);
        System.out.print("1광년 :%,d km\n", (long)light1);
    }
}