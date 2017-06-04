package com.lv.lesson06

/**
  * Date: 2017-06-04 
  * Time: 10:21 
  * Description:
  */
trait RichLogger extends Logger{
  override def log(message: String): Unit ={
    println("RichLogger  "+message)
  }
}
