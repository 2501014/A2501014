//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        //System.out.prinfln("I love you")

        for (int i = 1; i <= 10; i++) {
            System.out.printf("2%d I love you\n", i);
        }

        int i = 1;
        while (i <= 10) { //제어변수
            System.out.printf("2%d I love you\n", i++);
        }

        int j = 1;
        do {
            System.out.printf("2%d I love you\n", j++);
        } while (j <= 10);
    }
}