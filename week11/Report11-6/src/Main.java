//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        System.out.println("출력 예시 \n");
        System.out.println(" \t\t\t 수도 요금\n");

        System.out.println("--------------------------");
        System.out.printf("%-6s %-8s %-6s %7s %10s %7s %10s %-10s\n",
                "번호", "이름", "구분", "사용량", "사용 금액", "TAX", "납부액", "비교");
        System.out.printf("----------------------------");

        System.out.printf("1111", "홍길동", "가정용", 700.1, 29200, 1460, 30660, "");
        System.out.printf("2222", "이대한", "영업용", 56.7, 4335, 150, 4485,"일괄징수");
        System.out.printf("3333", "한국민", "군기관", 785.6, 16920, 0, 16920, "");
        System.out.printf("1212", "이으뜸", "공장용", 345.7, 28188, 700, 28888, "");
        System.out.printf("1313", "나이쁨", "관공서", 321.4, 12435, 180, 12615, "");
        System.out.printf("4444", "김도령", "관공서", 789.6, 28850, 430, 29280, "");
        System.out.printf("2121", "박대령", "가정용", 456.7, 19480, 970, 20450, "");
        System.out.printf("4343", "허달수", "가정용", 678.4, 28320, 1410, 29730, "");
        System.out.printf("6789", "장마당", "관공서", 56.7, 3195, 40, 3235, "");
        System.out.printf("4545", "정성길", "공장용", 895.6, 71088, 1770, 72858, "");

        System.out.println("---------------------------");
    }

    static void  printf(String no, String name, String type,
                        double usage, int amount, int tax, int total, String note){

        System.out.printf("%-6s %-8s %-6s %7.1f %%,10d %,7d %10d %-10s\n",
                no, name, type, usage, amount, tax, total, note);
    }
}