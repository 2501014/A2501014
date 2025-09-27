import java.util.Scanner;



public class Main{
    public static void main(String[]args){

        Scanner keyborad = new Scanner(System.in);
        float litter = 0.0f;
        float km = 0.0f;
        float result = 0.0f;

        System.out.print("사용 연료 량 입력 : ");
        litter = keyborad.nextFloat();
        System.out.print("운행 거리 : ");
        km = keyborad.nextFloat();

        result = km / litter;

        System.out.print("사용 완료 량 :%.2f %c\n", km, '\u2113');
        System.out.print("운행 거리 : %.2f km\n", km);
        System.out.print("연비 :%.2f km /%c\n", result, '\u2113');
    }
}