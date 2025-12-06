import java.sql.SQLSyntaxErrorException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String[][] employees = {{"홍길동", "1111"}, {"김명범", "1411"}, {"아이돌", "1167"},
                {"이동화", "1677"}, {"이동준", "1555"},{"안유진", "1311"},
                {"강혜원", "1316"}, {"김민주", "1265"},{"조유리", "1432"}};
        ;
            char[] hobong = new char[] {'1', '2','3', '5', '4', '3', '3', '1', '4', '2'};
            int[][] salarys = new int[employees.length][5]; //{기본급, 수당, 급여액, 세금, 지급액}

            int i = 0;
            while (i < employees.length){
                System.out.printf("%s 사원의 업무수당 입력 : ", employees[i][0]);
                sales[i][1] = keyborad.nextInt();

                if(sales[i][1] >= 0 && sales[i][1] <= 1000000
                   i++;
                eles{
                    System.out.println("ERROR : 0 ~ 1,000,000");
                    System.in.read();
                }
            }

            for (i = 0; i < employees.length; i++){
                switch (hobong[i]){
                    case '1' :
                        sales[i][0] = 1650000;
                        break;
                    case '2' :
                        sales[i][0] = 1680000;
                        break;
                    case '3' :
                        sales[i][0] = 1700000;
                        break;
                    case '4' :
                        sales[i][0] = 1720000;
                        break;
                    case '5' :
                        sales[i][0] = 1750000;
                        break;
                    default:
                        sales[i][0] = 0;
                }
            }

            for (i = 0; i < employees.length; i++){
                if (sales[i][2] >= 2600000){
                    sales[i][3] = (int) (sales[i][2] * (10.0f / 100));
                } else if (sales[i][2] >= 2000000){
                    sales [i][3] = (int) (sales[i][2] * (8.0f / 100));
                }else {
                    sales[i][3] = (int) (sales[i][2] * (5.0f / 100));
                }

                sales[i][3] /= 100;
                sales[i][3] *= 100;
            }

            for (i = 0; i < employees.length; i++){
                sales[i][4] = sales[i][2] - sales[i][3];
            }

            for (i = 0; i < employees.length -1; i++) {
                // 마지막 i개는 이미 정렬되어 있음
                for (int j = 0; j < employees.length - 1 - i; j++) {
                    //swap
                    String[] temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;

                    char temp1 = hobong[j];
                    hobong[j] = hobong[j + 1];
                    hobong[j + 1] = temp1;

                    int[] salary = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = salary;
                }
            }
        }

        System.out.println("*************************************************");
        System.out.println(" 사번 이름 호봉 기본급 업무수당 급여액 세금 지급액");
        System.out.println("*************************************************");
        for (int i = 0; i < employees.length; i++){
            System.out.printf("%5s %3s %c %,9d %,9d %,9d %,8d %,9d\n",
                    employees[i][1], employees[i][0],hobong[i],
                    sales[i][0], sales[i][1],sales[i][2], sales[i][3], sales[i][4]);
        }
        System.out.println("*************************************************");
    }
}