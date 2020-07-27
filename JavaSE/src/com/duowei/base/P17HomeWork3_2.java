package com.duowei.base;

/**
 * 插入一名员工
 * 按升序排列
 */

public class P17HomeWork3_2 {
    public static void main(String[] args) {
        //定义数组用于存放公司年龄
        int[] ages = {23, 25, 28, 34, 35, 50};

        int insage = 29;

        //定义新数组
        int[] agesNew = new int[ages.length + 1];
        for (int i = 0; i < ages.length; i++) {
            agesNew[i] = ages[i];
        }

        for (int i = agesNew.length - 2; i >= 0; i--) {
            if (insage < agesNew[i]) {
                agesNew[i + 1] = agesNew[i];
            } else {
                agesNew[i + 1] = insage;
                break;
            }
        }

        for (int i = 0; i < agesNew.length; i++) {
            System.out.println(agesNew[i]);
        }

    }
}
