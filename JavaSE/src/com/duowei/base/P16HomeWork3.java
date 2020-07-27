package com.duowei.base;

/**
 * 插入一名员工
 * 按升序排列
 */

public class P16HomeWork3 {
    public static void main(String[] args) {
        //定义数组用于存放公司年龄
        int[] ages = {23, 25, 29, 29, 34, 35, 50};

        int insage = 29;
        int indexTarget = -1;
        // 判断29应该插入哪个位置
        for (int i = 0; i < ages.length; i++) {
            if (insage >= ages[i] && insage <= ages[i + 1]) {
                indexTarget = i;
            }
        }

        //定义新数组
        int[] agesNew = new int[ages.length + 1];
        for (int i = 0; i < ages.length; i++) {
            agesNew[i] = ages[i];
        }

        //从indexTarget 到 ages.length 移动位置
        for (int i = agesNew.length - 1; i > indexTarget; i--) {
            agesNew[i] = agesNew[i - 1];
        }

        //插入
        agesNew[indexTarget+1] = insage;

        for (int i = 0; i < agesNew.length; i++) {
            System.out.print(agesNew[i] + " ");
        }
    }
}
