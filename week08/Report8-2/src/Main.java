//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int totalAnimal = 37;
        int total = 102;

        int chicken = 0;

        while (chicken <= totalAnimal){

            int dog = totalAnimal - chicken;
            int legs = chicken * 2 + dog * 4;

            if(legs == total){
                System.out.println("정답(while문");
                System.out.println("닭 : " + chicken + "마리");
                System.out.println("개 : " + dog + "마리");
            }

            chicken++;
        }
    }
}