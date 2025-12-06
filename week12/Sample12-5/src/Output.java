public class Output {
    public static  void display(students, int[] height, float[][] weight){
        display();
        System.out.println("이름 성별 키 체중 표중체중 BMI 판정");
        display();
        for (int i = 0; i < students.length; i++){
            System.out.printf("3%s %1s %2d Cm %5.1f Kg %5.1f Kg %5.1f %s\n",
                    studens[i][0], studens[i][1],height[i],
                    weight[i][0],weight[i][1], weight[i][2], studens[i][2]);
        }
        display();
    }
    private static void display(){
        System.out.println("**********************");
    }
}
