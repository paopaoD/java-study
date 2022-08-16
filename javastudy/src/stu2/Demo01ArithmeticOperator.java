package stu2;

/**
 * 演示算术运算符的使用
 */

//  Arithmetic: 算术    operator: 运算符

public class Demo01ArithmeticOperator {
    public static void main(String[] args) {

        // 运算符 /
        System.out.println(10 / 4);// 2     取整数
        //
        System.out.println(10.0 / 4);// 2.5  10.0是double类型  可以精确到小数

        double d = 10 / 4;  // 计算后的结果2 赋了double类型  为 2.0
        System.out.println(d);


        // % 取模 (取余)
        // 取模的本质是 一个公式 ： a % b = a - a/ b * b
        System.out.println(10 % 3); // 1
        // -10 % 3 = -10 - (-10) / 3 * 3
        //         = -10 - (-3) * 3
        //         = -10 + 9
        //         = -1
        System.out.println(-10 % 3); // -1
        // 10 % -3 = 10 - 10 / (-3) *
        //         = 10 - (-3) * (-3)
        //         = 10 - 9
        //         = 1
        System.out.println(10 % -3); // 1

        System.out.println(-10 % -3); // -1


        // ++ 自增
        int i = 10;
        i++;    // 自增，等价于 i = i + 1;
        ++i;    // 自增，等价于 i = i + 1;
        System.out.println("i = " + i);  // 11

        /*
        作为表达式使用
        前++ : ++i 先自增后赋值
        后++ : i++ 先赋值后自增
         */
        int j ;
        j = 8;

        int k = ++j;    // 等于是 先执行运算 j=j+1; 然后再赋值 k = j;
        System.out.println("j=" + j + "k=" + k); // 9  9

        int k1 = j++;    // 等于是 先赋值 k = j; 然后再执行运算 j=j+1;
        System.out.println("j=" + j + "k=" + k1); // 9 8


        System.out.println("================面试题================");
        /**
         * 面试题1：
         */
        int a = 1;
        a = a++;  // a = a++; temp = a;
        System.out.println(a);  // 1
        // 结果是1,
        //      因为 a = a++;首先会赋值给临时变量，比如temp = a; 相当于temp = 1;
        //       然后执行 a = a+1;执行完后,再次将临时变量赋给a
        //       a = temp; ==> a = 1;

        /**
         * 面试题2：
         */
        int b = 1;
        b = ++b;
        System.out.println(b); // 2
        // 结果是2,
        //      因为 b= ++b;首先会执行 b = b+1;执行完后,
        //      将b赋值给临时变量，比如 temp = b; ==> temp = 2;
        //      然后临时变量temp在赋值给b，
        //       b = temp; ==> b = 2;



    }
}
