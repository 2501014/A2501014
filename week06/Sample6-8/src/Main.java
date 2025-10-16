import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        final int RADIUS = 6378137; //meter;
        final int KOREA = 99720; //km
        final  float PI = 3.141592f; // PI
        float surface;
        float result;

        surface = 4 * PI * RADIUS * RADIUS / 1000; //km2
        result = KOREA / surface * 100;


        System.out.printf("지구의 반지름은 %,d \u3392 입니다.\n",RADIUS / 1000);
        System.out.printf("지국의 표면적은 %, .f \u33a2 입니다.\n",surface);
        System.out.printf("대한민국의 면적은 %,d \u33A2 입니다.\n",KOREA);
        System.out.printf("대한민국은 지구의 %.8f %%입니다.\n",result);
    }
}