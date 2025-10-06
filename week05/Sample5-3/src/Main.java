//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int a=5;
        boolean test= (5 > 4) && a++ != 0;
        System.out.printf("test =%b, a = %d\", test, a);  //ture, 6

        test= (5 <4) && a++ != 0;
        System.out.printf("test =%b, a = %d\", test, a);  //false,6

         test= (5 < 4) ||  a++ != 0;
        System.out.printf("test =%b, a = %d\", test, a);  //ture, 7

        test= (5 > 4) && a++ != 0;
        System.out.printf("test = %b, a = %d\", test ,a);  //ture, 7


        a = 5;
        test=(5 >4) & ++a != 0;
        System.out.printf("test = %b, a = %d\n", test, a);  //a= 6, ture

        test=(5 <4) & a++ != 0;
        System.out.println("test = %b, a = %d\n", test,a); //a=7 flase

        test=(5 < 4 ) | a++ != 0;
        System.out.println("test = %b,a =%\n",test,a); //a=8 ture

        test =(5 > 4) |a++ !=0;
        System.out.println();


    }
}
