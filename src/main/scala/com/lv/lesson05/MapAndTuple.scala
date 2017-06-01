package com.lv.lesson05

import scala.collection.mutable

/**
  * Date: 2017-06-01 
  * Time: 22:13 
  * Description: Map集合与元祖
  */
object MapAndTuple {
  def main(args: Array[String]): Unit = {
    //这两种情况是一样的
    val bigDatas = mutable.HashMap(("Spark" ,6), "Hadoop" -> 11) //调用工程方法模式apply来构造Map实例。
    bigDatas("Spark") = 20
    val prod = mutable.Map("Spark" -> 6, "Hadoop" -> 11)

    prod("Spark") = 15
    prod.put("java",20)
    for ((key, value) <- prod) println(key + ":" + value)
    //可以使用map直接获取key的值，但是不存在的key要抛出异常。所以不能这样用
    // println(prod("PHP"))
    //获取一个没有的key的值是None
    println(prod.get("PHP"))
    //利用getOrElse可以设置默认值
    println(prod.getOrElse("PHP",0))

    for(key <- prod.keySet) println(key)
    for(vaule <- prod.values) println(vaule)

    //map之间的转换
    val result = for((key, value) <- prod) yield (value,key)

    for ((key, value) <- result) println(key + ":" + value)


    //元组：可以做为函数的返回值。更多的可以看SparkContext

    val info =("ads","ma",30,"asadfs")
    print(info._1)
    print(info._2)
    print(info._3)
    print(info._4)
  }

}
