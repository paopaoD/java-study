package com.stu;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println("my first java code!");
        //
        //
        int money = 10_0000_0000;
        System.out.println(money);

        int years = 20;
        int total = money * years;  //  int最大20亿
        System.out.println(total);  // -1474836480；计算的时候溢出了

        long total2 = money * years;//默认的是int，计算之后再转换类型，存在问题
        System.out.println(total2);

        long total3 = money * ((long)years);//计算前转换类型，计算结果才正确
        System.out.println(total3);     // 20000000000

    }
}
