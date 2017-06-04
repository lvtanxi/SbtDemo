package com.lv.lesson06

/**
  * Date: 2017-06-04 
  * Time: 10:13 
  * Description:
  */
object HelloTrait {
  def main(args: Array[String]): Unit = {
    //利用with改变实现
    val loggin=new Loggin("才") with RichLogger
    loggin.log("Spark")
    val pa =new Passenger("Spark")
    println(pa.checkIn)
  }
}
