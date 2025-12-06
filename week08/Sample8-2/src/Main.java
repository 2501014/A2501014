import java.io.BufferedReader;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main{
    public static void main(String[] args)throwas IOException{
        BufferedReader br = new BufferedReader(new lnputStreamReader(System.in));
        int bottom, height;

        System.out.println("****삼각형의 넓이 구히기****");
        System.out.print("밑변 : ");
        bottom = lnteger.parselnt(br.readLine());
        System.out.print("높이 : ");
        height = lnteger.pareslnt(br.readLine());

        double area = (double)(bottom * height) / 2;

        System.out.printf("넓이 : %.2f", area);
    }
}