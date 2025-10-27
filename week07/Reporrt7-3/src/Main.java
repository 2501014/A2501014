//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int price = 10000; //기본 요금
              double discount = 0.0;

              System.out.print("나이를 입력하세요: ");
              int age = sc.nextInt();

              System.out.print("관람 시간(조조/일반: ");
              String time = sc.next();

              if (age >=65){
                  discount = 0.4; //40%할인
              } else  if (age >=8 && age <=18){
                  discount = 0.3; //30%할인
              }

              if(time.equals("조조")){
                  discount + = 0.2; //조조는 추가 20%
              }

              double finalprice = price * (1- discount);

              System.out.println("최종 관람 요금은 " + (int)finalprice + "원 입니다");

              sc.close();
    }
}