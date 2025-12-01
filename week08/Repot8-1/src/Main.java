//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        int chicken = 0;

        while (chicken <= 37){
            int dog = 37 - chicken;

            if(2 * chicken + 4 * dog == 102) {
                System.out.println("=== while문 결과 ===");
                System.out.println("닭 : + " + chicken + "마리");
                System.out.println("개 : " + dog + "마리");
                break;
            }

            chicken++;
        }
    }
}