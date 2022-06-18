package com.example.advanced.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 明明生成了NN个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 * <p>
 * 数据范围： 1 \le n \le 1000 \1≤n≤1000  ，输入的数字大小满足 1 \le val \le 500 \1≤val≤500
 * 输入描述：
 * 第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的随机数。 具体格式可以参考下面的"示例"。
 * 输出描述：
 * 输出多行，表示输入数据处理后的结果
 * <p>
 * 3
 * 2
 * 2
 * 1
 * 输出：
 * 1
 * 2
 */
public class 聪明的随机数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        int count = Integer.parseInt(line1);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String numberStr = scanner.nextLine();
            int number = Integer.parseInt(numberStr);
            list.add(number);
        }

        // 去重
        list.stream().distinct().sorted().forEach(System.out::println);
    }


}
