package me.keyskull

/**
  * Created by keyskull on 2017/2/2.
  */
package object util {
  implicit def autoConvertAny(v: Any) = new TypeChange(v)
}
