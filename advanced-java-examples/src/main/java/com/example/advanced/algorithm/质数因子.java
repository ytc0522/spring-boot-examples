package com.example.advanced.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * <p>
 * <p>
 * 数据范围： 1 \le n \le 2 \times 10^{9} + 14 \1≤n≤2×10
 * 9
 * +14
 * 输入描述：
 * 输入一个整数
 * <p>
 * 输出描述：
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。
 */
public class 质数因子 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        ArrayList<Long> resultList = new ArrayList<>();
        zhi(num, resultList);
        lastN(num, resultList);
        resultList.stream().forEach((e) -> {
            System.out.print(e + " ");
        });
    }

    public static void zhi(Long num, List<Long> list) {
        if (num < 2) {
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                list.add((long) i);
                Long newNum = num / i;
                zhi(newNum, list);
                break;
            }
        }
    }

    public static void lastN(Long num, List<Long> list) {
        if (list.size() == 0) {
            list.add(num);
        } else {
            Long lastN = num;
            for (Long n : list) {
                lastN /= n;
            }
            if (lastN != 1) {
                list.add(lastN);
            }
        }
        list = list.stream().sorted().collect(Collectors.toList());
    }


}
