package soyosoyo
package core.arrays

abstract class ImmArray2D[T] {
  val dim1: Int
  val dim2: Int
  
  def read( dim1: Int, dim2: Int): T
  def overwrite( dim1: Int, dim2: Int, data: T ): ImmArray2D[T]
  //def operate( slice: Slice2D, func: (T => T) ): ImmArray2D
  
  def output(): ImmArray2D[T]
  def outputArray(): Array[Array[T]]
}

//protected class Array2DIflat[T]( private val data: Array[T], val dim1: Int, val dim2: Int ){
//
//  def 
//}

//protected class ImmArray2D[T]( private val data: Array[Array[T]], val dim1: Int, val dim2: Int ){
//
////  val originalData = data.clone()
////  def
//}