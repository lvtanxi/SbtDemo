package com.lv.lesson06

/**
  * Date: 2017-06-04 
  * Time: 10:32 
  * Description:
  */
class Passenger(val name:String) extends Information{
  override def getInformation: String = name
}
