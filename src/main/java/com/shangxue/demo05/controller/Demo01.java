package com.shangxue.demo05.controller;

import java.math.BigInteger;

public class Demo01 {
    public static  void  main(String[] args){
       //数据类型  变量名 赋值符号   变量值
           byte     b     =          1 ;
           byte     b0   ;
           b0  =  1;
           b0  =  2;

          // byte b1= 129; 为什么错误？
        //因为它在内存中的容量不够了
        byte b_min = -128;
        byte b_max = 127;
        System.out.println("byte的最大值为"+b_max+",byte的最小值为"+b_min);
        //byte是由八个bit组成,每一个bit它所能代表的值0/1,而byte是java中整数类型中最小的一个类型
        //0000 0000 计算机是二进制的
        // 0 1  10  11  100  101  110 111  1000  二进制
        // 0 1   2   3  4    5    6    7    8    十进制
        //一个bit所能代表的最大值是1   2的一次方减一
        //两个bit所能代表的最大值是3   2的二次方减一
        //三个bit所能代表的最大值是7   2的三次方减一
        //n个bit所能代表的最大值是？？  2的n次方减一
        //一个byte在内存里面占8个bit 2的8次方减一(255)这个时候，byte的最小值为？ 0
        //取第一位为符号位  第一位数为0时，此数为正数，为1时，次数为负数
        //这时，一个byte代表数字的位，只有7个bit了 （0~127）（-127~-0）把-0取出来，-128
        //一个byte代表的数值范围（-128 ~ 127 ）：
       //包含符号位时：
        //一个byte有8个bit
        //一个short有16个bit
        //一个int有32个bit
        //一个long有64个bit

        //除去符号位时：
        //一个byte有7个bit 最大值为2的七次方-1  最小值为2的七次方
        //一个short有15个bit 最大值为2的15次方-1  最小值为2的15次方
        //一个int有31个bit   最大值为2的31次方-1  最小值为2的31次方
        //一个long有63个bit  最大值为2的63次方-1  最小值为2的63次方




        //思考？？
        //十进制的时候，所能代表的最大值
        //一位数的最大值是 9    10的一次方减一
        //两位数的最大值是 99   10的二次方减一
        //三位数的最大值是 999  10的三次方减一
        //n位数的最大值是多少？ 9999...(一共n个9)


        //八进制
        // 十六进制..
        //short int long

        //short是由16个bit组成 思考一下？ short的最大值，以及最小值   2的16次方-1  0-65535    32767 -32768

        short s_min = -32768;
        short s_max = 32767;
        System.out.println("short的最大值为"+s_max+",short的最小值为"+s_min);

        //int 是由32个bit组成  2147483647 -2147483648

        int i_min = -2147483648;
        int i_max = 2147483647;
        System.out.println("int的最大值为"+i_max+",int的最小值为"+i_min);

        //long 是由64个bit组成1844......   9223372036854775807  -9223372036854775808

        long l_min = -9223372036854775808L;
        long l_max = 9223372036854775807L;
        System.out.println("long的最大值为"+l_max+",long的最小值为"+l_min);
    }
}
