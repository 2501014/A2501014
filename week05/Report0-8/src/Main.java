//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args){

        int year = 400;

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + "년은 윤년입니다");
        }else{
            System.out.println(year + "년은 윤년이 아닙니다");
        }
    }
}