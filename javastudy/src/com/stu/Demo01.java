package com.stu;
/**
 * 数据类型：
 *         1，基本类型：
 *                  数值类型：整数，浮点类型，字符类型，
 *                  boolean类型：布尔类型
 *         2，引用类型:
 *                  类，接口，数组
 *
 *         3，类型转换：
 *              低   ---------------------------------------->   高
 *              byte,short,char --> int --> long --> float --> double
 *              char --> int --> long --> float --> double
 *
 *              运算中，不同类型的数据先转换成同一类型，然后进行运算。
 *
 *              强制类型转换：高 --> 低
 *              自动类型转换：低 --> 高
 *
 *          bit:计算机中最小的存储单位。
 *          byte:计算机中基本存储单元，字节。1byte=8bit。
 */


public class Demo01 {
    public static void main(String[] args) {
        System.out.println("八大基本数据类型....");

        // 整数
        int num1 = 10;
        byte num2 = 20;
        short num3 = 30;
        long num4 = 30L; //Long类型要在整数后加L(不分大小写)

        // 浮点数:小数
        float num5 = 50.1F;//Float类型要在后面加F(不分大小写)
        double num6 = 3.141592653589793238462;

        //字符
        char name = '中';     // char 字符用 '' 单引号

        //字符串   String不是关键字  是类
        String Aeacher = "张三";  // String 字符串用 " " 双引号

        //布尔值：True/False
        boolean flag = true;
        boolean flag1 = false;


    }
}


