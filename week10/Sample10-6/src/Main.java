import java.util.concurrent.StructuredTaskScope;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String[] hakbun = {"2501002", "2501004","2501012", "2501022", "2501032",
                "2501042", "2501054", "2501062", "2501072", "2501082"};
        String[] name = {"홍길동", "이재명", "윤석역", "경복대", "오세훈",
        "김명범", "김시온", "이진우", "한장우", "니키타"};
        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];

        int[] sum = new int[name.length];
        float[] avg = new float[name.length];
        int[] rank = new int[name.length];
        boolean swapped = false;

        int i = 0;
        while (i < kor.length) {
            System.out.printf("%s님의 국어 성적 입력 : \n",name[i]);
            kor [i] = keyborad.nextInt();
            System.out.printf("%s님의 영어 성적 입력 : \n",name[i]);
            eng [i] = keyborad.nextInt();
            System.out.printf("%s님의 수학 성적 입력 : \n",name[i]);
            math [i] = keyborad.nextIne();

            if ((kor[i] >= 0 && kor [i] <= 100)&&
                    (eng[i] >= 0 && eng [i] <= 100)&&
                    (math[i] >= 0 && math [i] <= 100)){
                i++;

                System.out.println();
            }else {
                System.out.println("ERROR : 0 ~ 100");
                System.in.read();
            }
            System.out.println();

            for (i = 0; i < name.length -1; i++) {
                swapped = false;

                // 인접한 원소 비교 및 교환
                for (int j = 0; j < name.length - 1 - i; j++) {
                    if (sum[j] < sum[j + 1]) {
                        // 자리 교환 (swap)
                        String text = stnum[j];
                        stnum[j] = stnum[j + 1];
                        stnum[j + 1] = text;

                        text = name[j];
                        name[j] = name[j + 1];
                        name[j + 1] = text;

                        int data = kor[j];
                        kor[j] = kor[j + 1];
                        kor[j] = data;

                        data = eng[j];
                        eng[j] = eng[j + 1];
                        eng[j + 1] = data;

                        data = math[j];
                        math[j] = math[j + 1];
                        eng[j + 1] = data;

                        data = sum[j];
                        sum[j] = sum[j + 1];
                        sum[j + 1] = data;

                        swapped = true;
                    }
                }

                if (!swapped) break;
            } */

            for (i = 0; i < kor.length; i++)
                avg [i] = sum [i] / 3.0f;

            for(i = 0; i < kor.length; i++){
                rank[i] = 1;
                for (int j = 0; j < kor.length - 1; j++){
                    if (sum[i] == sum[j])
                        ++rank[i];
                }
            }

            /* for (i = 0; i < kor.length; i++){
            rank[i] = i + i;
            }

            for(i = 0; i < kor.length -1; i++){
               if(sum[i] == sum[i+1])
                  rank[i + 1] = rank[i];
            }*/





            /* for (i = 0; i < name.length -1; i++){
                swapped = false;

                //인접한 원소 비교 및 교환
                for(int j = 0; j < name.length -1 -i; j++){
                if (stnum[j].compareTo(stnum[j + 1]) > 0) {
                   // 자리 교환(swap)
                   String text = stnum[j];
                   stnum[j] = stnum[j + 1];
                   stnum[j + 1] = text;

                   text = name[j];
                   name[j] = name[j + 1];
                   name[j + 1] = text;

                   int data = kor[j];
                   kor[j] = kor[j + 1];
                   kor[j + 1] = data;

                   data = eng[j];
                   eng[j] = eng[j + 1];
                   eng[j + 1] = data;

                   data = math[j];
                   eng[j] = mata[j + 1];
                   eng[j + 1] = data;

                   data = sum[j];
                   sum[j] = sum[j + 1];
                   sum[j + 1] = data;

                   data = rank[j];
                   rank[j] = rank[j + 1];
                   rank[j + 1] = data;

                   float temp = avg[j];
                   avg[j] = avg[j + 1];
                   avg[j + 1] = temp;

                   swapped = true;
            }
        }
        // 교환이 한 번도 없으면 이미 정렬 완료 → 종료
        if ( ! swapped) break;
        } */

        System.out.println("*********************************");
        System.out.println(" 학번 이름 국어 영어 수학 총점 평균 등수");
        System.out.println("*********************************");
        for (i = 0; i < name.length; i++){
            System.out.print("%7s %3s %3d %3d %3d %3d %5.1f %2d\n",
                    stnum[i], name[i], kor[i], eng[i], math[i], sum[i], avg[i], rank[i]);
        }
        System.out.println("**********************************");
    }
}