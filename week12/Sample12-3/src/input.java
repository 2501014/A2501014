import javax.imageio.IIOException;
import java.util.Scanner;

public class input {
    public static int readData() throws IOException{
        Scanner keyborad = new Scanner(System.in);
        int readius;

        while (true){
            System.out.print("원의 반지름 입력 : ");
            readius = keyborad.nextInt();
            if (readius > 0)
                break;
            else {
                System.out.println("ERROR : 양의 정수 입력");
                System.in.read();
            }
        }
        return readius;
    }
}
