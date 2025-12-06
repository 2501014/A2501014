import java.io.FilterOutputStream;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyborad = new Scanner(System.in);

        int[] score = new int[10];
        int total = 0;
        float average;
        int max;
        int min;

        System.out.println("학생 10명의 성적을 입력하세요");

        for (int i = 0; i < 10; i++){
            System.out.print((i + 1) + "번쨰 학생 성적 : ");
            score[i] = keyborad.nextInt();
        }

        max = score[0];
        min = score[0];

        for(int i = 0; i < 10; i++){
            total += score[i];

            if(score[i] > max)
                max = score[i];

            if(score[i] < min)
                min = score[i];
        }

        average = total / 10.0f;

        System.out.println();
        System.out.println("출력 결과");
        System.out.println("합계 :  " + total);
        System.out.printf("평균 : %.2f\n", average);
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
