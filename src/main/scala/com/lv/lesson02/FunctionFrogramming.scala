package com.lv.lesson02

/**
  * Date: 2017-05-30 
  * Time: 21:13 
  * Description: 函数可以被简单的认为是包裹了一条或者多条语句的代码体。
  * 该代码体接收若干参数，经过代码体的处理后返回结果。在Scala中可以像变量一样
  * 被赋值、被传递。变量也可以赋值给函数。之所以可以是这样，原因是因为函数背后是类
  * 和对象，也就是说在运行的时候函数其实是一个变量。当然，背后的类是Scala语言自动帮助我们生成的
  * ，可以实现范序列化。
  * 例如：f(x) = x + 1
  * 意义：
  * 1、可以天然的序列化和反序列化的直接好处就是函数可以在分布式系统上传递
  * 2、因为函数背后其实是类和对象，所以可以和普通的变量完全一样的应用在任何普通变量可以运用的地方。包括传递参数、返回值等等
  *
  * 函数的要点：
  * 1、def关键字来定义函数
  * 2、函数会自动进行类型推断来度额定函数返回值的类型.如果无法推倒，则需要自己声明
  * 3、函数的参数可以有默认值。这样在调用函数的时候如果不想改变默认的话就直接不传递该参数、
  * 4、我们可以基于函数参数的名称来调整函数参数的顺序。为什么呢？原因是因为函数背后是类，参数就是类的属性
  * 5、函数中如果不能确定参数的个数，可以使用变长参数如：numbers:Int*。可变参数中的数据其实会手机吃呢个Array数组。我们在入口方法main中其实就是可变参数
  * 6、
  */
object FunctionFrogramming {
  def main(args: Array[String]): Unit = {
    hello(age = 12)
    println("fibonacci " + fibonacci(5))
    println("sum  " + sum(1, 2, 3, 4, 5))
    println("sum  " + sum(1L to 5: _*)) //1到5
    println("sumRecuresive  " + sumRecuresive(1 to 5: _*)) //1到5
  }

  def hello(name: String = "qwe", age: Int = 23): Unit = {
    println("Hello,my name is " + name)
    println("Hello,my age is " + age)
  }

  def fibonacci(n: Long): Int = {
    if (n <= 1)
      1
    else fibonacci(n - 2) + fibonacci(n - 1)
  }

  def sum(numbers: Long*): Long = {
    var result = 0L
    for (number <- numbers)
      result += number
    result
  }

  def sumRecuresive(numbers: Int*): Int = {
    if (numbers.isEmpty) 0
    else numbers.head + sumRecuresive(numbers.tail:_*) //head表示第一个;numbers.tail:_*剩下的数据集合
  }

}
