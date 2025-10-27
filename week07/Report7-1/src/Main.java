//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        System.out.print("3개의 점수를 입력하세요: ");
        int a = sc.nexint();
        int b = sc.nextint();
        int c = sc.nextInt();

        int max, mid, min;

        //대,중,소 구하기
        if (a >- b && a >=c){
            max = a;
            if (b >= c){
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        } else  if (b >= a && b >=c){
            max = b;
            if (a >= c){
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }else { //c가 가장 큰 경우
                max = c;
                if (a >=b){
                    mid = a;
                    min = b;
                }else {
                    mid = b;
                    min = a;
                }
        }

            System.out.printf("입력 받은 %d,%d,%d를 크기 순으로 나열하면 %d, %d, %d 입니다.%n",
                    a,b,c,min,mid,max);

            sc.close();

    }
}