import java.util.Scanner;

 public class main{
    public static void main(String[] args) {

        Scanner keyborad = new Scanner(System.in);
        double area;

        System.out.print("평수 입력: ");
        area = keyborad.nextDouble();

        long area10 = Math.round(area*10);

        long price = area10*56000/10;

        price = ((price/1000) *1000);

       System.out.printf("%.1f평 가격은 %,d원입니다. ",area, price);
   }
}