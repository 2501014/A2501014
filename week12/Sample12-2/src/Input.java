import java.util.Scanner;

public class Input {

    public static int readData(){
        Scanner keyborad = new Scanner(System.in);
        int  temp;

        System.out.println("썹씨온도 입력 : ");
        temp = keyborad.nextInt();

        return temp;

    }
}
