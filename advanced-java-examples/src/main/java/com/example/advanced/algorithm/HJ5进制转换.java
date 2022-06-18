package com.example.advanced.algorithm;

import java.util.Scanner;

/**
 * 描述
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 * <p>
 * 数据范围：保证结果在 1 \le n \le 2^{31}-1 \1≤n≤2
 * 31
 * −1
 * 输入描述：
 * 输入一个十六进制的数值字符串。
 * <p>
 * 输出描述：
 * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
 */
public class HJ5进制转换 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str = str.replace("0x", "");

        int num = Integer.parseInt(str, 16);
        System.out.println("num = " + num);
    }


}
