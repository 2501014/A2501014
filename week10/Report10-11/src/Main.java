import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keborad = new Scanner(System.in);

        final float MID_WEIGHT = 0.15f;
        final float FINAL_WEIGHT = 0.15f;
        final float QUIZ_WEIGHT = 0.10f;
        final float HOMEWORK_WEIGHT = 0.40f;
        final float ATT_WEIGHT = 0.20F;

        int mid, fin, quiz, homework, attendance;
        float simleAvg, weightedAvg;

        System.out.print("중간 점수 입력 : ");
        mid = keborad.nextInt();

        System.out.print("기말 점수 입력 : ");
        fin = keborad.nextInt();

        System.out.print("퀴즈 점수 입력 : ");
        quiz = keborad.nextInt();

        System.out.print("과제 점수 입력 : ");
        homework = keborad.nextInt();

        System.out.print("출석 점수 입력 : ");
        attendance = keborad.nextInt();

        simleAvg = (mid + fin + quiz + homework + attendance) / 5.0f;

        weightedAvg = (mid * MID_WEIGHT)+
                (fin * FINAL_WEIGHT)+
                (quiz * QUIZ_WEIGHT)+
                (homework + HOMEWORK_WEIGHT)+
                (attendance * ATT_WEIGHT);

        System.out.printf("단순 평균 점수 : %.2f점\n", simleAvg);
        System.out.printf("가중치 평균 점수 : %.2f 점\n", weightedAvg);
    }
}