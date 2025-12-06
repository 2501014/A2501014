import java.util.Scanner;

public class input {
    public static int[] readData(int [] data){
        Scanner keyborad = new Scanner(System.in);

        for(int i = 0; i < data.length; i++){
            System.out.printf("%d번쨰 Data 입력 : ", i + 1);
            data[i] = keyborad.nextInt();
        }
        return data;
    }
}
