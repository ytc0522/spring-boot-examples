package com.example.advanced.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * HJ4 字符串分隔
 * <p>
 * 描述
 * •输入一个字符串，请按长度为8拆分每个输入字符串并进行输出；
 * <p>
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入描述：
 * 连续输入字符串(每个字符串长度小于等于100)
 * <p>
 * 输出描述：
 * 依次输出所有分割后的长度为8的新字符串
 * <p>
 * 示例1
 * 输入：
 * abc
 * <p>
 * 输出：
 * abc00000
 */
public class HJ4字符串分隔 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        List<String> list = new ArrayList<>();
        if (line.length() < 8) {
            String newLine = tabZero(line);
            list.add(newLine);
        } else {
            String temp = "";
            for (int i = 0; i < line.length(); i++) {
                temp += line.charAt(i);
                if (i % 8 == 7) {
                    list.add(temp);
                    temp = "";
                } else if (i == line.length() - 1) {
                    String newTemp = tabZero(temp);
                    list.add(newTemp);
                }
            }
        }
        list.forEach(System.out::println);
    }


    public static String tabZero(String origin) {
        String zeros = "";
        for (int i = 0; i < 8 - origin.length(); i++) {
            zeros += "0";
        }
        origin = origin + zeros;
        return origin;
    }


}
