package com.stu;

public class Demo03Float {
    public static void main(String[] args) {
        System.out.println("===========浮点数拓展==========");

        //========================
        //浮点数:    float 4字节
        //          double 8字节
        //          浮点数在机器中存放形式(组成方式)：浮点数 = 符号位+指数位+尾数位
        //          尾数部分可能丢失，造成精度损失(小数都是近似值)
        //========================

        //  java的浮点型常量(具体值)默认是double型，声明float类型常量,须后加‘f’或‘F’
        //float num1 = 1.1; 这样写是错的，1.1默认是double类型，8字节，而定义的是float类型
        float num2 = 1.1F;     // 声明是float类型  加F
        System.out.println(num2);

        double num3 = 1.1;
        System.out.println(num3);

        double num4 = 1.1F;       // 自动类型转换
        System.out.println(num4);


        // 浮点型常量 有两种表示形式：
        //      十进制：        如5.12   512.0f  .512    (必须有小数点)
        //      科学计数法形式:   5.12e2[5.12*10的2次方]  5.12E-2[5.12/10的2次方]

        //十进制
        double num5 = .123;
        System.out.println(num5);//等价于0.123
        //科学计数法形式
        System.out.println(5.12e2);//512.0
        System.out.println(5.12E-2);//0.0512

        //通常情况下，应该使用double型，因为它比float型更精确
        // 举例：
        double num9 = 2.1234567851;
        float num10 = 2.1234567851F;

        System.out.println(num9);   //2.1234567851
        System.out.println(num10);  //2.1234567



        // 浮点数陷阱(拓展)：
        // 1
        double num11 = 2.7;
        double num12 = 8.1/3;//2.7
        System.out.println(num11);  // 2.7
        System.out.println(num12);  // 2.6999999999999997

        System.out.println(num11 == num12); //false
        //得到一个重要使用点：当我们对运算结果是小数的进行相等判断时，要小心
        //应该是以两个树的差值的绝对值，在某个范围内判断

        if (num11 == num12){
            System.out.println("num11 == num12 相等");
        }
        //正确写法：
        if(Math.abs(num11 - num12) < 0.000001) {
            System.out.println("差值非常小，到我的规定精度，认为相等...");
        }
        // 可以通过java API 来看
        System.out.println(Math.abs(num11 - num12));


        // 2
        float d1 = 1235544666;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);   // true

        // 浮点数的计算结个是有限的，有舍入误差，约等于  也就是接近但不等于
        // 所以最好完全避免使用浮点数进行相等判断比较！
        // 所以最好完全避免使用浮点数进行相等判断比较！
        // 所以最好完全避免使用浮点数进行相等判断比较！




    }
}
