import java.io.IOException;
import java.util.Scanner;

public class input {
   static Scanner keyborad = new Scanner(System.in);

   public static void readData(String[][] students, int[] height){
       int i = 0;
       while (i < students.length){
           System.out.printf("%s 학생의 키 입력 : ", students[i][0]);
           height[i] = keyborad.nextInt();
           if(height[i] >= 30 && height[i] < 230)
               i++;
           else {
               System.out.println("ERROR : 30 ~ 230");
               System.in.read();
           }
       }
   }

   public static void readData(String[][] studens, float[][] weigth) throws IOException{
       int i = 0;
       while (i < studens.length) {
           System.out.printf("%s 학생의 몸무게 입력 : ", studens[i][0]);
           weigth[i][0] = keyborad.nextFloat();
           if (weigth[i][0] >= 30 && weigth[i][0] < 230)
               i++;
           else {
               System.err.println("ERROR : 30 ~ 230");
               System.in.read();
           }
       }

   }
}
