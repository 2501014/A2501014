//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        System.out.print("국어 영어 수학 성적을 입력하세요");
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int meta = sc.nextInt();

        double avg = (kor =eng + meta) / 3.0;
        String result = ""; //결과 문자열

        int (avg >= 80){
            result = "성적 양호";
        } else if (avg >= 60){
            result = "노력";
        } else {
            result = "성적 불량";
        }

        char grade;
        if (avg >=90) grade = 'A';
        else if (avg >=80) grade = 'B';
        else if (avg > 70) grade = 'C';
        else if (avg > 60) grade = 'D';
        else grade 'F';

        System.out.println("============");
        System.out.println("국어\t영어\t수학\t평균\t학점\t결과");
        System.out.printf("%d\t%d\t%d\t%.2f\t%c\t%s",
                kor, eng, meta, avg, grade, result);
        System.out.println("============");

        sc.close();
        {

        }
    }
}