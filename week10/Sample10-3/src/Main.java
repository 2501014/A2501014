import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new  Scanner(System.in);
        String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈"};
        float [] weight = new float[name.length];
        final float MIN = 30.0f;
        final float MAX = 120.0f;
        boolean swapped = false;

        int i = 0;
        while (i < name.length){
            System.out.printf("%s님의 몸무게 입력 : ", name[i]);
            weight[i] = keyborad.nextFloat();

            if (weight[i] >= MIN && weight[i] <= MAX)
                i++;
            else {
                System.err.printf("ERROE : %.1f ~ %.1f", MIN, MAX);
                System.in.read();
            }
        }
        for (int a = 0; a < weight.length -1; a++) {
            swapped = false;

            for (int j = 0; j < name.length -1 - i; j++){
                if (weight[j] >  weight[j+1]){
                    // 자리 교환 (swap)
                    float temp = weight[j];
                    weight[j] = weight[j+1];
                    weight[j + 1] = temp;

                    String text = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = text;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        for (i = 0; i < name.length; i++){
            System.out.printf("%s님의 몸무게 : %5.1f kg\n", name[i], weight[i]);
        }

    }
}