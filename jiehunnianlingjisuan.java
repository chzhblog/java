import java.util.Scanner;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
/**
 * 这个程序主要用于练习if判断语句
 * @Date 2020.7.3
 */

public class jiehunnianlingjisuan {
     public static void main(String[] args) {
         System.out.print("请输入你的年龄:");
         Scanner in = new Scanner(System.in);
         int age = in.nextInt();
         if(age<=0 || age>=200){
             System.out.println("你输入的年龄不合法！！");
             return;
         }
         System.out.println("你的年龄是:"+age+"");
         if(age<18){
             System.out.println("你还不符合法定结婚年龄");
         }else if(age>18){
             System.out.println("你可以随便找女朋友了");
         }
       
    }
    
}