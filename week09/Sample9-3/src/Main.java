import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        final int COUNT = 5;
        int total = 0;
        float avg = 0.0f;
        int gread;

        int i = 1;
        while (i <= COUNT){
            System.out.printf("%d번 학생 성적 입력 : ", i);
            gread = keyborad.nextInt();
            if (gread >= 0 && gread <= 100) {
                total += gread;
                i++;
            }else {
                System.err.println("ERROR : 0~100");
                System.in.read();
            }
        }

        avg = total / (float) COUNT;

        System.out.printf("총점 : %,d 점\n", total);
        System.out.printf("평균 : %.2f점\n", avg);
    }
}