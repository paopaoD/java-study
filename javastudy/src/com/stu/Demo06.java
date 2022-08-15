package com.stu;

/**
 *
 * 自动类型转换：当java程序进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型
 *
 *      数据类型按精度(容量)大小排序：
 *              低   ---------------------------------------->   高
 *    byte --> short --> int --> long --> float --> double
 *              char --> int --> long --> float --> double
 *
 */


public class Demo06 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;   //高-->低，强制转换，存在内存溢出问题

        System.out.println(i);
        System.out.println(b);

        int a = 128;
        double d  = a;
        System.out.println(d);

        /**
         * 注意点：
         *      1,不能对Boolean值进行转换
         *      2,不能把对象类型转换为不相干的类型
         *      3,在把高容量转换到低容量的时候，强制转换
         *      4,转换的时候可能存在内存溢出，或者精度问题
         */

        System.out.println("===========================");
        System.out.println((int)23.7);  //23    存在精度问题
        System.out.println((int)-45.89f);   //-45  存在精度问题

        System.out.println("===========================");
        char c = 'a';
        int e = c+1;
        System.out.println(e);  //98
        System.out.println((char)e);    // b

        System.out.println();

    }
}

















