# 第 3 章 表、栈和队列

本章主要讨论三种基本的数据结构，提供了两个库类重要子集`ArrayList`和`LinkedList`的代码

## 3.1 抽象数据类型

抽象数据类型(abstract data type, ADT)是带有一组操作的一些对象的集合，可以有添加(add)、删除(remove)以及包含(contain)这样的一些操作，也可以只要两种操作并(union)和查找(find)

## 3.2 表ADT

形如$A_0, A_1, A_2, ···, A_{N-1}$的形式一般称为表，表的大小为 $N$

### 3.2.1 表的简单数组实现

可以使用数组实现表的所有操作，以下是解释数据如何拓展

```java
int [] arr = new int[ 10 ];
int [] newArr = new int [ arr.length * 2 ];
for(int i = 0; i < arr.length; i++)
    newArr[i] = arr[i];
arr = newArr;
```

> printList->线性时间
>
> findKth->常数时间
>
> 插入->位置0插入$O(n)$
>
> 删除->删除第一个 $O(n)$

## 3.2.1 简单链表

链表由结点组成，这些结点在内存中不必连续存储，每一个结点包含表元素和包含该元素后继结点的地址链(link)，我们称之为 next 链

## 3.3 Java Collections API 中的表

Java中

