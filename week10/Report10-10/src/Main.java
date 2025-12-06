import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        int total = 0;
        int min, max;

        for(int i = 0; i < 10; i++){
            System.out.print("score[" + i + "] = ");
            score[i] = sc.nextInt();
        }

        min = score[0];
        max = score[0];

        for (int i = 0; i < 10; i++){
            total += score[i];

            if(score[i] < min){
                min = score[i];
            }

            if(score[i] > max){
                max = score[i];
            }
        }

        float average = (float) total / 10;

        System.out.println("총점(total) = " + total);
        System.out.println("평균(average) = " + average);
        System.out.println("최소값(min) = " + min);
        System.out.println("최대값(max) = " + max);

    }
}