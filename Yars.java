import java.util.Scanner;
/**
 * 输入一个年份，判断是否为闰年/平年
 */

public class Yars{
    public static void  main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入年份:");
  
        int yars = in.nextInt();
        if (yars%4 == 0 && yars%100 !=0) {
            System.out.println(yars+"年是闰年");
        }else{
            System.out.println(yars+"年是平年");
        }
        in.close();
    }

}