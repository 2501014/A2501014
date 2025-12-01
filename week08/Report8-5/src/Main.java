//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int well = 300;
        int up = 55;
        int down = 13;
        int day = 0;
        int height = 0;

        while (true){
            day++;

            height += up;

            if(height >= well){
                System.out.println("달팽이는 " + day + "일 만에 우물에서 탈출했습니다");
                break;
            }

            height -= down;
        }

        if(day <= 7) {
            System.out.println("방울꽃이 시들기 전에 도착했습니다!");
        }else {
            System.out.println("방울꽃이 이미 시들었습니다...");
        }
    }
}