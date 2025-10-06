import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
        char type = ' ';
        int width = 0;
        int height = 0;
        int area = 0;

        System.out.print("사각형의 가로 길이 입력: ");
        width = keyborad.nextInt();
        System.out.print("사각형의 세로 길이 입력: ");
        height = keyborad.nextInt();

        type = width == height ? '정' : '직';
        area = width * height;

        System.out.printf("**** %c사각형 넓이 ****\n", type);
        System.out.printf(3"\t가로 길이 : %d Cm\n", width );
        System.out.printf("\t세로 길이 :%d Cm\n", height);
        System.out.printf("\t넓이     :%d \3340\\n", area);
    }
}