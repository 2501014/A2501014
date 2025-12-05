import javax.imageio.IIOException;
import java.util.Scanner;

public class input
public static float[] reaData(String[][]customers){
    float[] data = new float[customers.length];

    for (int i = 0; i < custmore.length; i++)
        data[i] = readata(customers[i][1]);  // call by value

    return data;
    }

    private static float readata(String name) throws IOException {
    Scanner keyborad = new Scanner(System.in);
    float temp;
    while (true){
        System.out.printf("%s 고객의 수도 사용량 입력 : ", name);
        temp = keyborad.nextFloat();
        if(temp >= 0.0f && temp <= 999.9f)
            break;
        else {
            System.out.println("ERROR");
            System.in.read();
        }
    }
    return temp;
}

public static void freeProcess(String[] customer){
    if(customer[2].equals("1")){
        customer[3] = "기정용";
    } else if (customer[2].equals("2")) {
        customer[3] = "영업용";
    }else if (customer[2].equals("3")) {
        customer[3] = "공장용";
    } else if (customer[2].equals("4")) {
        customer[3] = "관공서";
    }else if (customer[2].equals("5")){
        customer[3] = "군기관";
    }else {
        customer[3] = "";
    }
}

