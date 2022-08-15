package com.stu;


public class Demo05Boolean {
    public static void main(String[] args) {
        System.out.println("==========布尔类型===========");

        //========================
        //布尔类型
        //      1,只允许取值true和false，无null
        //      2,boolean类型占1个字节
        //      3,适用于逻辑运算
        //          if条件空值语句;
        //          while循环控制语句;
        //          do-while循环控制语句;
        //          for循环控制语句
        //========================

        //演示判断案例
        boolean ispass = true;
        if (ispass == true){
            System.out.println("考试通过，恭喜");
        }else {
            System.out.println("开始没有通过，下次努力");
        }

        // 2
        boolean ispass1 = false;
        if (ispass1 == true){
            System.out.println("考试通过，恭喜");
        }else {
            System.out.println("开始没有通过，下次努力");
        }

        // 使用细节说明：
        // java不能以 0 或 非0 的整数代替false和true




    }
}
