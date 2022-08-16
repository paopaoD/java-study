package com.stu;

public class Demo08StringToBasic {
    public static void main(String[] args) {
        //基本数据类型 --> String
        // 语法：将基本类型的值 + "" 即可
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        System.out.println("=======================================");
        // String --> 对应的基本数据类型
        // 语法：通过基本类型的包装类调用parseXX方法即可
        String s5 = "123";

        //使用 基本数据类型对应的包装类 的相应方法，得到基本数据类型
        int num1 = Integer.parseInt(s5);
        float num2 = Float.parseFloat(s5);
        double num3 = Double.parseDouble(s5);
        long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        short num6 = Short.parseShort(s5);
        boolean b = Boolean.parseBoolean("true");

        System.out.println(num1);//123
        System.out.println(num2);//123.0
        System.out.println(num3);//123.0
        System.out.println(num4);//123
        System.out.println(num5);//123
        System.out.println(num6);//123
        System.out.println(b);  //true


        // 字符串string --> char 字符
        //   字符串转为字符类型时，是指得到字符串的第一个字符
        //  s5.charAt(0) 得到 s5 字符串的第一个字符 '1'
        System.out.println(s5.charAt(0));



        System.out.println("==============练习1=============");
        // 练习1：
        //  保存两个本书名，用+拼接，看效果。
        //  保存两个性别，用+拼接，看效果。
        //  保存两本书的价格，用+拼接，看效果

        String book1 = "天龙八部";
        String book2 = "笑傲江湖";
        System.out.println(book1 + book2);//天龙八部笑傲江湖

        char c1 = '男';
        char c2 = '女';
        System.out.println(c1 + c2);//得到的是两个字符对应的码值的和 52906

        float price1 = 123.45F;
        float price2 = 23.56F;
        System.out.println(price1 + price2);//147.01
        //或者使用double类型：
        double price3 = 123.45;
        double price4 = 23.56;
        System.out.println(price3 + price4);//147.01


        System.out.println("==============练习2=============");
        // 练习2：
        String name = "tom";
        int age = 18;
        double score = 80.9;
        char gender = '男';
        String hobby = "打篮球";

        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + name + "\t" + age +
                "\t" + score + "\t" + gender + "\t" + hobby);





    }
}
