package com.duowei.base;

import java.util.Scanner;

/**
 * hr demo
 * function
 * 1、sort for age
 * 2、find the max age in ages
 * 3、find the min age in ages
 * 4、insert a new age in last of ages
 * 5、insert a new age for order
 */
public class P18HomeWorkHr {
    public static void main(String[] args) {
        System.out.println("please enter number of employ : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("please enter employ's age");
        int[] ages = new int[number];
        for (int i = 0; i < number; i++) {
            ages[i] = scanner.nextInt();
        }
        printIntArrays(ages);
        while (true){
            System.out.println("please choose function 1、sort for age " +
                    "2、find the max age in ages " +
                    "3、find the min age in ages " +
                    "4、insert a new age in last of ages " +
                    "5、insert a new age for order");
            int functionNumber = scanner.nextInt();
            switch (functionNumber) {
                case 1:
                    //function 1
                    bubble(ages);
                    printIntArrays(ages);
                    break;
                case 2:
                    //function 2
                    int maxAge = findMaxAge(ages);
                    System.out.println(maxAge);
                    break;
                case 3:
                    int minAge = findMinAge(ages);
                    System.out.println(minAge);
                    break;
                case 4:
                    System.out.println("please enter a new number");
                    int newNumber = scanner.nextInt();
                    ages = insertLastNumber(ages, newNumber);
                    printIntArrays(ages);
                    break;
                case 5:
                    System.out.println("please enter a new number");
                    int newNumber2 = scanner.nextInt();
                    ages = insertOrderNumber(ages, newNumber2);
                    printIntArrays(ages);
                    break;
                default:
                    System.exit(0);
                    break;
            }

        }
    }

    public static void printIntArrays(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(i + "----" + arrays[i]);
        }
    }

    /**
     * func1
     *
     * @param arrays
     */
    public static void bubble(int[] arrays) {
        //how many numbers do you need to compare
        for (int j = 0; j < arrays.length - 1; j++) {
            //i begin 0 end arrays.length - 1 , compare with the next number
            for (int i = 0; i < arrays.length - 1 - j; i++) {
                if (arrays[i] > arrays[i + 1]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = temp;
                }
            }
        }
    }

    /**
     * function2 find max age
     */
    public static int findMaxAge(int[] arrays) {
        int maxAge = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > maxAge) {
                maxAge = arrays[i];
            }
        }
        return maxAge;
    }

    /**
     * function 3 find min age
     *
     * @param arrays
     * @return
     */
    public static int findMinAge(int[] arrays) {
        int minAge = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] < minAge) {
                minAge = arrays[i];
            }
        }
        return minAge;
    }

    /***
     * funtion 4
     * @param arrays
     * @param newNumber
     * @return int[]
     */
    public static int[] insertLastNumber(int[] arrays, int newNumber) {
        //create a new array
        int[] newAges = new int[arrays.length + 1];
        //copy old array to new array
        for (int i = 0; i < arrays.length; i++) {
            newAges[i] = arrays[i];
        }
        newAges[newAges.length - 1] = newNumber;
        return newAges;
    }


    /***
     * function5
     * @param arrays
     * @param newNumber2
     * @return int[]
     */
    public static int[] insertOrderNumber(int[] arrays, int newNumber2) {
        // first order to array
        bubble(arrays);
        //create new array
        int[] newAges = new int[arrays.length + 1];

        for (int i = 0; i < arrays.length; i++) {
            newAges[i] = arrays[i];
        }

        for (int i = newAges.length - 2; i >= 0; i--) {
            if (newAges[i] > newNumber2) {
                newAges[i + 1] = newAges[i];
                if (i == 0) {
                    newAges[0] = newNumber2;
                }
            } else {
                newAges[i + 1] = newNumber2;
            }
        }
        return newAges;
    }

}
