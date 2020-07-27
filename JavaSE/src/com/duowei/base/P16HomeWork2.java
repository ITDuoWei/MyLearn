package com.duowei.base;

/**
 * 统计全公司的年龄，并且以降序打印出来
 * 用冒泡排序
 */

public class P16HomeWork2 {
    public static void main(String[] args) {
        //定义数组用于存放公司年龄
        int[] ages = {34, 35, 50, 25, 23, 28, 32};

        //version1 普通版
//        for (int i = 0; i < ages.length - 1; i++) {
//            if (ages[i] < ages[i + 1]) {
//                int temp = ages[i];
//                ages[i] = ages[i + 1];
//                ages[i + 1] = temp;
//            }
//        }

        for (int j = 0; j < ages.length - 1; j++) {
            for (int i = 0; i < ages.length - 1 - j; i++) {
                if (ages[i] < ages[i + 1]) {
                    int temp = ages[i];
                    ages[i] = ages[i + 1];
                    ages[i + 1] = temp;
                }
            }
        }


        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

    }
}
