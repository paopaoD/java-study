package com.stu;

/**
 * 自动类型转换：当java程序进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型
 *
 *      数据类型按精度(容量)大小排序：
 *          低   ---------------------------------------->   高
 *          byte --> short --> int --> long --> float --> double
 *                    char --> int --> long --> float --> double
 */


public class Demo06AutoConvert {
    public static void main(String[] args) {
        // 自动转换
        int num = 'c';    // char --> int  自动转换
        double d = 33;  // int --> double 自动转换

        System.out.println(num);//99
        System.out.println(d);// 33.0

        //自动类型转换的注意和细节:

        /**
        // 细节1,
        //      多种类型的数据混合运算时，系统首先自动将所有的数据转换成容量最大的数据类型，
        //      再进行计算
         */
        int n1 = 10;
        //float d1 = n1 + 1.1; n1+1.1 => 结果类型默认是 double
        double d1 = n1 + 1.1;     // 浮点数默认类型是double
        float d2 = n1 + 1.1F;
        System.out.println(d1);
        System.out.println(d2);

        /**
        // 细节2,
        //      当把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时，就会报错，
        //      反之就会进行自动类型转换
         */

        //int n2 = 1.1; // 1.1默认double类型，不能自动转换为int  会报错

        /**
        // 细节3,
        //      (byte,short) 和 char 类型之间，不会自动类型转换。
        //      当把具体的数赋给byte时，先判断该数是否在byte范围(-127~128)内,
        //      如果是,就可以
         */
        byte b1 = 10; //10 默认是int类型,在byte范围内，可以直接赋给byte,
        //byte b2 = 1000; // 1000超出了byte范围，不能直接赋值
        System.out.println(b1);

        int n2 = 1;
        //byte b2 = n2;   //n2是变量，直接判断类型，int类型不能转换为byte类型

        short s1 = b1;
        //char c1 = b1;   // byte类型不能自动转换成 char
        //char c2 = s1;   // short类型不能自动转换成 char

        /**
        //细节4,
        //      byte,short,char 三者之间可以进行运算，计算时先转换为int类型
        //      不管是混合类型，还是同一类型，运算时，都转换为int类型
        */

        byte b2 = 1;
        byte b3 = 2;
        short s2 = 1;
        //short s3 = b2 + s2; // b2 + s2 ==> int类型
        int s3 = b2 + s2;
        System.out.println(s3);

        //byte b4 = b2 + b3;  // 这样也是错的，因为计算时默认转换为int类型
        int b4 = b2 + b3;// 不管是混合类型，还是同一类型，运算时，都转换为int类型
        System.out.println(b4);

        /**
         * 5,
         *      boolean类型不参与转换
         */

        /**
         * 细节6,
         *       自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
         *
         */
        byte b5 = 1;
        short s4 = 100;
        int num2 = 1;
        double num3 = 1.1;

        //int num5 = b5+s4+num3+num2;//错误写法，最大类型为double，不能转为int
        //float num6 = b5+s4+num3+num2;//写法错误,最大类型为double,不能转为float
        double num7 = b5 + s4 + num3 + num2;
        System.out.println(num7);




    }
}

















