package com.lv.lesson06

/**
  * Date: 2017-06-04 
  * Time: 10:15 
  * Description:
  */
class Loggin(val name: String) extends Logger {
  override def log(message: String): Unit = {
    println(name+">>"+message)
  }
}
