package com.lv.lesson03

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

/**
  * Date: 2017-05-31 
  * Time: 06:31 
  * Description: 大数据是数据的集合以及对数据集合的操作技术的统称。具体来说：
  * 1、数据几个：会涉及数据的搜集、存储等。搜集会有很多技术。存储现在使用Hadoop、kafka
  * 2、对数据集合的操作技术，用的较多的是Spark
  * 3、底层的实现还是基于JVM的数组来实现的
  *
  */
object CollectionOp {
  def main(args: Array[String]): Unit = {
    val array = Array(1, 3, 2, 4, 5) //类型是根据值来推倒的
    val array2 = Array.apply(10 to 15: _*)
    for (item <- array) println(item)
    for (item <- array2) println(item)

    /**
      * ArrayBuffer 添加元素默认是在末尾追加元素。效率高
      */
    val array3 = ArrayBuffer[Int]()
    array3.insert(0, 123)
    array3.insert(1, 456) //在指定的位置添加元素
    array3 += 0 //在数组末尾添加元素
    array3 += (1, 2, 3)

    array3.remove(1)
    array3.toArray //需要多线程并发操作的时候，需要转为Array
    for (item <- array3) println(item)
    //这是遍历下标
    for (i <- array.indices) println(array(i) + ">>>")
    //设置步长来遍历集合
    for (i <- 0 until(array.length, 2)) println(array(i) + ">>>")
    //反转遍历
    for (i <- array.indices.reverse) println(array(i) + ">>>")

    println("sum array " + array.sum)
    println("Max array " + array.max)
    Sorting.quickSort(array)
    println("order array " + array.mkString(","))
    //利用yield语法来完成新数据集合
    val arrayx = for (item <- array) yield item + 1
    println("yield array " + arrayx.mkString(","))
    //Scala有丰富的算子函数。filter 、 map
    println("array filter "+array.filter {_% 2 == 0 }.mkString(","))
    println("array filter map "+array.filter {_% 2 == 0 }.map{_*10}.mkString(","))
  }
}
