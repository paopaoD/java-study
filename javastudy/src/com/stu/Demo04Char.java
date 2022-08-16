package com.stu;

public class Demo04Char {
    public static void main(String[] args) {
        System.out.println("==========字符拓展===========");

        //========================
        //字符拓展   输出时，默认输出Unicode码对应的字符
        //
        //         所有的字符本质上还是数字
        //========================

        char c1 = 'a';     // char 只能用 '' 单引号

        System.out.println(c1);
        System.out.println((int)c1);   //强制类型转换  输出对应的ASCII编码


        char c2 = '中';

        System.out.println(c2);
        System.out.println((int)c2);   //强制类型转换  输出的是ASCII编码


        char c3 = 97;

        System.out.println(c3);  // a  输出的是Unicode码对应的字符
        System.out.println((int)c3);



        // char类型是可以进行运算的，不同类型的数据先转换成同一类型，然后进行运算
        /**
         * char类型 只有运算的时候，才会转成相对应的字符码值
         */
        System.out.println('a' + 10);   // 107


        // 练习：
        char c5 = 'b'+1;
        System.out.println((int)c5);    // 99
        System.out.println(c5);         // c


    }
}
/**
/*
    //字符类型本质：
    //      1,字符型存储到计算机中，需要降字符对应的码值(整数)找出来，比如'a'
    //        存储：'a'--> 码值 97 --> 二进制(0110 0001) --> 存储
    //        读取：二进制(0110 0001) --> 97 --> 'a' --> 显示

    //      2,字符和码值的对应关系是通过字符编码表决定的(是规定好的)


 * 编码
 *      ASCII：  1个字节表示，一共128个字符，实际上一个字节可以表示256个字符，只用了128个
 *      Unicode： 0-65536，固定大小的编码，使用2个字节表示字符，字母和汉字统一占用2个字节
 *      utf-8：  大小可变的编码，字母使用1个自己，汉字使用3个字节
 *      gbk：    可以表示汉字，而且范围广，字符1个字节，汉字2个字节
 *
 # Ascii编码表中熟记：
 #       1.\x00 -----> 表中第一项
 #       2.\x01 -----> 1 字符 "1"
 #       3.\x09 -----> 9  \t  tab字符
 #       4.\x0a -----> 13  \n  换行符
 #       5.\x0d -----> 13  \r  回车
 #       6.\x30~\x39 -----> 48~57 字符 0~9 \x31 字符1
 #       7.\x41 -----> 65 A
 #       8.\x61 -----> 97 a

 */
























