import java.util.Scanner;
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르
public class Main {
    public static void main(String[] args){
    String name ="홍길동";
    int age = 21;
    float eye = 1.2f;
    String blood = "0";

    System.out.print("이름 : %s\n",name);
    System.out.print("나이 : %2d\n", age);
    System.out.print("시력 : %3,1f\n"eye);
    System.out.print("혈액형 : %s\n",blood);
    }
}