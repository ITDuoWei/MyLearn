package com.duowei.base;

/**
 * 统计全公司的年龄，并且以升序打印出来
 * 用选择排序
 */

public class P15HomeWork1 {
    public static void main(String[] args) {
        //定义数组用于存放公司年龄
        int[] ages = {34, 35, 29, 25, 23, 50, 32};
        //version1 普通版
        //取出第一个值和所有值对比，找到最小值放到第一个
//        for (int i = 0; i < ages.length; i++) {
//            if (ages[i] < ages[0]) {
//                int temp = ages[i];
//                ages[i] = ages[0];
//                ages[0] = temp;
//            }
//        }
//
//        for (int i = 0; i < ages.length; i++) {
//            System.out.print(ages[i] + " ");
//        }
//        System.out.println(" ");
//        System.out.println("----------------");
//        for (int i = 1; i < ages.length; i++) {
//            if (ages[i] < ages[1]) {
//                int temp = ages[i];
//                ages[i] = ages[1];
//                ages[1] = temp;
//            }
//        }
        //优化版
        for (int j = 0; j < ages.length; j++) {
            for (int i = j; i < ages.length; i++) {
                if (ages[i] < ages[j]) {
                    int temp = ages[i];
                    ages[i] = ages[j];
                    ages[j] = temp;
                }
            }
        }


        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
    }
}
