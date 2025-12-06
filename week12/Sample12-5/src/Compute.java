public class Compute {
    public static  void  standard(String[][] students, int[]heigtt, float[][]weigth){

    for(int i = 0; i < students.length; i++){
            if (students[i][1].equals("남")){
                weight[i][1] = (height[i]) - 100) * 9.0f;
            }else {
                weight[i][1] = (heigtt[i] - 100) * 8.5f;
            }
    }

}
public static void bmi (float[][] weight){

    for (int i = 0; i < weight.length; i++){
        weight[i][2] = ((weight[i][0] - weight[i][1]) / weight[i][1]) * 100;
    }

    }

    public static void check(String[][] studens, float[][] weight){
        for(int i = 0; i < studens.length; i++){
            if (weight[i][2] <= -10.0f){
                studens[i][2] = "저제충";
            }else if (weight[i][2] <= 20.0f){
                studens[i][2] = "정상 체중";
            }else if (weight[i][2]) <= 29.0f{
                studens[i][2] = "경도 비만";
            }else if (weight[i][2] <= 49.0f){
                studens[i][2] = "중등도 비만";
            }else {
                studens[i][2] = "고도 비만"
            }
        }
    }
}
