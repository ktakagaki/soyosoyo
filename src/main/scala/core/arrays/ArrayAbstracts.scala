package soyosoyo
package core.arrays

abstract class ImmArray2D[T] {
  val dim1: Int
  val dim2: Int
  
  def read( dim1: Int, dim2: Int): T
  def overwrite( dim1: Int, dim2: Int, data: T ): Array2DI
  def operate( slice: Slice2D, func: (T => T) ): Array2DI
  
  def output(): ImmArray2D[T]
  def outputArray(): Array(Array[T])
}

//protected class Array2DIflat[T]( private val data: Array[T], val dim1: Int, val dim2: Int ){
//
//  def 
//}

protected class ImmArray2D[T]( private data: Array(Array[T]), val dim1: Int, val dim2: Int ){

  val originalData = data.clone()
  def
}