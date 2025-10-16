

public class Main {
    public static void main(String[] args) {
        final float YEAR = 365.2422f;
        int day;
        int hour;
        int minute;
        int second;

        float temp = YEAR;
        day = (int) temp;
        temp -= day;
        temp *= 24;
        hour = (int) temp;


        temp -= day;
        temp *= 60;
        minute = (int) temp;

        temp -= hour;
        temp *= 60;
        temp = (int) (temp + 0.5f);

        System.out.printf("1년은 %.4f일 입이다.\n", YEAR);
        System.out.printf("\t %d 일 \n\t %d 시간 \n\t %d 분 \n\t % d 초"
                , day, hour, minute, second);
    }
}