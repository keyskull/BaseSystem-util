package me.keyskull.util

import scala.util.Try

/**
  * Created by keyskull on 2017/2/2.
  */
class TypeChange(val model: Any) {

  def tryToInt: Try[Int] = Try(model match {
    case null => 0
    case x: Byte => x.toInt
    case x: Short => x.toInt
    case x: Long => x.toInt
    case x: AnyRef => x.toString.toInt
    case x: Int => x
    case _ => throw new Exception("无法转换类型" + model.getClass)
  })

  def tryToString:Try[String] =Try(model match {
    case null => ""
    case x:Any => x.toString
  })

  def tryToLong: Try[Long] = Try(model match {
    case null => 0
    case x: Byte => x.toLong
    case x: Short => x.toLong
    case x: Int => x.toLong
    case x: Long => x
    case x: AnyRef => x.toString.toLong
    //    case x:AnyVal => x.toString.toLong
    case _ => throw new Exception("无法转换类型" + model.getClass)
  })

  def tryToDecimal: Try[BigDecimal] = Try(model match {
    case null => BigDecimal(0)
    case x: Byte => BigDecimal(x)
    case x: Short => BigDecimal(x)
    case x: Int => BigDecimal(x)
    case x: Long => BigDecimal(x)
    case x: AnyRef => BigDecimal(x.toString)
    //    case x:AnyVal => x.toString.toLong
    case _ => throw new Exception("无法转换类型" + model.getClass)
  })

  def tryToDouble: Try[Double] = Try(model match {
    case x: Double => x
    case x: Int => x.toDouble
    case x: Long => x.toDouble
    case x: String => x.toDouble
    case _ => throw new Exception("无法转换类型" + model.getClass + ":" + model)
  })

  def tryToBoolean: Try[Boolean] =Try(model match {
    case null => false
    case x: String => if(x.toLowerCase.eq("true"))true else x.toBoolean
    case x: Boolean => x
    case _ => throw new Exception("无法转换类型" + model.getClass + ":" + model)
  })

}
