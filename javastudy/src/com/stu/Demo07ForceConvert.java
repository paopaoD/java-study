package com.stu;

//forceconvert 强制转换

/**
 *  强制类型转换：
 *
 *          自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。
 *          使用时要加上强制转换符(),但可能造成精度降低或溢出，格外要注意
 *
 */

public class Demo07ForceConvert {
    public static void main(String[] args) {

        // 强制类型转换
        /**
         * 1,
         *    当进行数据类型从大-->小，就需要使用强制转换。
         */
        int n1 = (int)1.9; // double --> int
        System.out.println(n1);  //1    造成 精度损失


        int n2 = 2000;
        byte b1 = (byte) n2;   //高-->低，强制转换，存在内存溢出问题
        System.out.println(b1);// -48  造成 数据溢出

        /**
         * 2,
         *    强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级。
         */

        //int x = (int)10*3.5+6*1.5;  // 编译错误，double--> int类型
        int x = (int)(10*3.5+6*1.5);  //先计算，然后对结果类型强制转换
        System.out.println(x);        //(int)44.0 -> 44


        /**
         * 3,
         *    char类型可以保存int的常量值，但不能保存int 的变量值，需要强转。
         */
        char c1 = 100;
        int m = 100;
        //char c2 = m;    // m 为int类型，不能直接赋给 char
        char c3 = (char)m; // 强制转换后，可以赋值  输出的是100对应的字符--> d

        System.out.println(c1);
        System.out.println(m);
        System.out.println(c3);


        /**
         * 4,
         *    byte和short类型进行运算时，当做int类型处理。
         */
        System.out.println();
        char a = 100;
        int b = 99;
        double c = a+b;
        System.out.println(c);


        System.out.println("============练习===============");
        // 练习
        short s = 12;
        //s = s - 9;// 错误，s-9是int类型，不会自动转换为short类型
        System.out.println(s);

        byte e = 10;
        //e = e + 1;  //  错误，e+1是int类型，不会自动转换为byte类型
        e = (byte)(e+1);
        System.out.println(e);

        char r = 'a';
        int i = 16;
        float d = .314F;
        double result = r + i + d;  //正确  结果为float，可以自动转换为double
        System.out.println(result);

        byte s1 = 16;
        short s2 = 14;
        //short s3 = s1+s2;   // 错误，s1+s2是int类型，不会自动转换为short类型
        int s3 = s1 + s2;
        System.out.println(s3);




        char c2 = 'a';
        int q = c2 + 1;
        System.out.println(q);  //98
        System.out.println((char)q);    // b





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
