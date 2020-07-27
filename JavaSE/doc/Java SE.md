# Java SE 

参考链接：https://www.jianshu.com/u/fd1eb24db014



## 1 变量

声明：起名

定义：类型、大小

赋值：

使用：



## 2 数据类型

### 2.1 基本与引用数据类型对比

基本数据类型：一个值

引用数据类型：一群值

数据存储的位置有下面三种可以把内存比作宾馆

栈：前台和大厅， 前台存放门牌号、大厅有来登记的来宾

堆：房间、通过问前台门牌号才能找到

方法区：宾馆的内置食堂，大家都能去吃饭

基本类型手动初始化、引用类型默认初始化。



基本数据类型：整数、浮点、字符、布尔

引用类型：String、Array、对象等



### 2.2 玩转数组

数组：相同类型，例如停车场、厕所的坑位

定义时候需要知道   存什么类型、存几个（是厕所还是停车场，几个坑还是几个停车位）要定义好

int[] a = new int[5]

练习题：

1、在数组中找到某个值

2、在数组里找到最大值

3、在数组里找到最小值

4、选择排序(每次和所有值比较，找到最值放到第一个)

```java
int[] ages = {34, 35, 29, 25, 23, 50, 32};
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
```

5、冒泡排序（每次对比相邻的两个元素）

```java
int[] ages = {34, 35, 29, 25, 23, 50, 32};
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
```

6、在数组中插入一个元素并排序

```java
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
        break
    }
}

for (int i = 0; i < agesNew.length; i++) {
    System.out.println(agesNew[i]);
}
```

## 3 方法

**函数与方法**

函数是独立的，方法是有主语的，描述谁的方法。

程序的函数、对象的方法

不过Java里都习惯叫方法

## 4 面向对象

描述万物，不过是有哪些特点、能干什么。

**面向过程与面向对象**

把面向过程与面向对象类比于语言

可以类比英语的 主语  谓语  宾语

主语.谓语   返回值 宾语

面向过程的主语都是  我 

面向对象的主语可以是任何人

**类与对象**

面向对象的类就像一个模板，模板里的属性和方法都是为对象准备的



**基本类型和引用类型**

都是为了存储数据，基本类型只能存一种类型，引用类型如对象，是为了把不同类型的数据打包一起

比如：

基本数据类型：旺仔牛奶、旺旺米饼、旺旺奶糖，

对象：旺旺大礼包

