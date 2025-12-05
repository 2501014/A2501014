import javax.xml.crypto.Data;
import java.util.concurrent.Callable;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int[][] data = {{1, 3, 6, 9, 12}, {4, 8, 12, 56, 78}};

        Output.dispaly(data);

        Compute.multiple(data); //2차원
        Output.dispaly(data);

        for (int i = 0; i < data.length; i++)
            Compute.multiple(data[i]); // 1차원 배열

        Output.dispaly();
        for (int i = 0; i < data.length; i++)
            Output.dispaly(data[i]);
        Output.dispaly();

        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                data[i][j] = Compute.multiple(data[i][j]); // call by value
                }
            }

        Output.dispaly();
        for (int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length; j++){
                Output.dispaly(data[i][j]);
            }
            System.out.println();
        }
        Output.dispaly();
    }
}