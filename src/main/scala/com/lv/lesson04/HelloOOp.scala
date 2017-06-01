package com.lv.lesson04

/**
  * Date: 2017-06-01 
  * Time: 21:41 
  * Description:
  */
class HelloOOp {
  val name = "Spark"
  def sayHello(name:String): Unit = {
    println("Hi,My name is ")
    println("Hi,My name is "+name)
  }
}

object HelloOOp{
  def apply():HelloOOp ={
    HelloOOp()
  }

  def main(args: Array[String]): Unit = {
    val helloOOp = HelloOOp()
    helloOOp.sayHello("张三")
  }
}
