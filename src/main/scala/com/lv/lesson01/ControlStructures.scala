package com.lv.lesson01

/**
  * Date: 2017-05-29 
  * Time: 08:39 
  * Description: 流程控制结构。顺序、条件和循环三种方式。
  * 这个跟其他JVM语言是一致的。Scala也有一些高级流程控制
  * 这里主要是if、for、while的讲解
  */
object ControlStructures {
  def main(args: Array[String]): Unit = {
    println("scala")
    val age = 30
    /**
      * 注意:if...else 是有返回值的。替换了三目运算
      * 1、返回的类型是根据运算的结果来决定的
      * 2、if条件表达式中可以进行类型推倒，类型推倒的一般过程就是根据变量值的类型来推倒确定变量的类型。这在很多复杂
      * 算法的实际情况中省略变量的类型书写，为复杂算法的实现提供了非常大的便利
      * 3、单个if也是可以返回值,他的实际实现是if()...else()不满足条件的时候返回的是()字符串
      * 4、if表达式中如果多语句可以使用{}包裹起来。
      * 5、补充说明.{...}代表了一个语句块，语句块是有值的。值就是最后一条语句。该类型就是最后一条语句值的类型
      * 6、if可以与for循环等其他控制结构中使用
      */
    val result = if (age > 25) "worker" else "student"
    println(result)

    val res = if (age > 45) "Adult" else 1
    println(res)

    val res3 = if (age > 45) 1
    println(res3)

    var x, y = 0
    val res4 = if (age > 18) {
      x = x + 1
      y = y + 1
      x + y
    } else 0

    println(res4)

    /**
      * <- 表示提取值
      * to 表示一个区间
      */
    for (i <- 0 to 5 if i == 4) {
      println(i)
    }
    /**
      * for循环是不断的循环一个集合。然后for循环后面的{...}代码块部分会根据(..)里面提取的集合的item作为{...}的输入
      * 1、if flag表示条件守卫，用于限制for循环。去掉不必要的执行步骤，或者说用于跳出for循环
      * 2、for循环中能提取出什么内容取决于后面的集合的类型。
      * 3、想跳出for循环的话，除了加入if守卫以外，还可以使用return关键字
      */
    var flag = true
    var sum = 0

    for (i <- 0 to 5 if flag) {
      sum += i
      if (4 == i)
        flag = false
    }
    println(sum)

/*    for (i <- 0 to 10) {
      if (i == 5)
        return // 返回的是方法级别的。返回后，后面代码就不执行了，跟java的return不一样
      println(i)
    }*/

    for (item <- "Scala") println(item)

    /**
      * while循环。也是循环几个来作为(...)的输入。进而完成流程的控制。
      * while循环在实际Server和Framework开发中很重要。例如：让一个
      * 线程一直循环下去，一般都会使用while
      */
    flag = true
    while (flag) {
      for (item <- "scala") {
        println(">>>")
        flag ='a'.equals(item)
      }
    }
  }
}
