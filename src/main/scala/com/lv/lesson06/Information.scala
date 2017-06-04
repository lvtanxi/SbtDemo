package com.lv.lesson06

/**
  * Date: 2017-06-04 
  * Time: 10:30 
  * Description:
  */
trait Information {
  def getInformation:String
  def checkIn:Boolean={
    "Spark".equals(getInformation)
  }
}
