import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int[] score = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.printf((i + 1) + "번쨰 점수 입력: ");
            score[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < 10; i++){
            total += score[i];
        }

        float average = (float) total / 10;

        int min = score[0];
        for(int i = 1; i < 10; i++){
            if (score[i] < min) min = score[i];
        }

        int max = score[0];
        for (int i = 1; i < 10; i++){
            if (score[i] > max) max = score[i];
        }

        System.out.println("*****************");
        System.out.println("총합(total) : " + total);
        System.out.println("평균(average): " + average);
        System.out.println("최소값(min) : " + min);
        System.out.println("최대값(max) : " + max);
        System.out.println("******************");
    }
}

