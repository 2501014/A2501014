import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyborad = new Scanner(System.in);
        final int start = 1;
        final int LAST = 100;
        int start, last;
        int sum = 0;

        while(ture) {
            System.out.printf("어디서부터 더할까요? : ");
            start = keyborad.nextInt();
            System.out.printf("어디서까지 더할까요? : ");
            last = keyborad.nextInt();
            if (start < last) {
                break;
            } else {
                System.out.println("ERROR : 시작은 끝보다 작아야함.");
                System.in.read();
            }
        }

        for (int i = start; i <= last; i++) {
            sum += i;
        }
        System.out.printf("%d + %d + ... + %d + %d = %d\n",start ,start +1,last -1, last ,sum);
    }
}
