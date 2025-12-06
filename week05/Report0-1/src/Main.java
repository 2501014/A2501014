//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int  i = 10;
        int j = 5;

        if(i % j == 0){
            System.out.println(i + "는 " + j + "로 나누어떨어집니다");
        }else{
            System.out.println(i + "는 " + j + "로 나누어 떨어지지 않습니다");
        }
    }
}