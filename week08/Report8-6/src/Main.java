//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int wellHeight = 300;
        int up = 55;
        int down = 13;

        int height = 0;
        int days = 0;

        while (true){
            days++;
            height += up;

            if (height >= wellHeight){
                break;
            }

            height -= down;
        }

        System.out.println("달팽이는 " + days + " 일 만에 우물을 탈출합니다");
    }
}