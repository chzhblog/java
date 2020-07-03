import java.util.Scanner;

public class chenji {
    public static void main(String[]args){
        System.out.print("请输入学生成绩:");
        Scanner input = new Scanner(System.in);
        int naber = input.nextInt();
        input.close();
        if(naber>=0 && naber <=60 ){
            System.out.print("不及格");
        }else if( naber >=60 && naber <=80){
            System.out.print("良好");
        }else if(naber >=80 && naber <=100){
            System.out.print("优秀");
        }else{
            System.out.print("你输入的成绩不合法");

        }

    }
    
}