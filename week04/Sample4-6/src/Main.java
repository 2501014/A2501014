import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyborad=new Scanner(System.in);
        float height;
        float weight;
        final float FEETUINT=0.033f;
        final float POUNDUNIT=2.2205;
        float pound, feet; //정보

        System.out.printf("당신의 키 입력(170.3cm):");
        height=keyborad.nextFloat();
        System.out.printf("당신의 몸무게 입력(72.3Kg):");
        weight= keyborad.nextFloat();

        feet=height*FEETUINT;
        pound=weight*POUNDUNIT;

        System.out.printf("당신의 키(%.2f Cm)는 %.3f 피트(feet)입니다.\n",height,feet);
        System.out.printf("당신의 몸무게(%.2f kg)는 %.3f 파운드(pound)입니다. \n",weight,pound);
    }
}