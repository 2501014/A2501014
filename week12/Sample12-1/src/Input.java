import java.util.Scanner;

public class Input {
    static int readData(String s){
        Scanner keyborad = new Scanner(System.in);
        int temp;

        System.out.print(s);
        temp = keyborad.nextInt();

        return temp;
    }
}
