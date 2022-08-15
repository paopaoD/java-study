package com.stu;

public class Demo02Int {
    public static void main(String[] args) {

        System.out.println("===========整数==========");
        //========================
        //整数拓展:   类型            占用存储空间    范围
        //          byte[字节]        1字节     -127~128
        //          short[短整型]      2字节     -(2**15) ~(2**15)-1
        //          int[整型]         4字节     -(2**31) ~ (2**31)-1
        //          long[长整型]       8字节     -(2**63) ~ (2*63)-1
        //========================

        //  java的整型常量(具体值)默认是int类型，声明是long类型常量必须后加‘l’或‘L’
        int n1 = 1;//4个字节
        //int n2 = 1L;
        long n3 = 1L;
        System.out.println(n1);
        System.out.println(n3);

        // bit:计算机中最小的存储单位。
        // byte:计算机中基本存储单元，字节。1byte=8bit。
        // long 类型  8个字节    8*8=64个bit

        //      进制  二进制0b   十进制   八进制0   十六进制0x
        int a = 10;
        System.out.println(a);

        int a1 = 010;   //二进制0b
        System.out.println(a1);

        int a2 = 0x10;  //八进制0
        System.out.println(a2);



        System.out.println("============练习===========");
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






























