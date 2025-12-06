import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyborad = new Scanner(System.in);

        int[] score = new int[10];
        int total = 0;
        int max, min;
        float average;

        System.out.println("10개의 정수 데이터 입력");

        for (int i = 0; i < 10; i++){
            System.out.printf("%d : ", i + 1);
            score[i] = keyborad.nextInt();
        }

        max = score[0];
        min = score[0];

        for(int i = 0; i < 10; i++){
            total += score[i];

            if(score[i] > max)
                min = score[i];

            if(score[i] < min)
                max = score[i];
        }

        average = total / 10.0f;

        System.out.println("\n출력 결과");
        System.out.printf("합계 : %d\n", total);
        System.out.printf("평균 : %.2f\n", average);
        System.out.printf("최대값 : %d\n", max);
        System.out.printf("최소값 : %d\n", min);
    }
}