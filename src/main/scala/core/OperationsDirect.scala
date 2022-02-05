package soyosoyo
package core

trait OperationsDirect {

//  // <editor-fold defaultstate="collapsed" desc=" add/addTo ">
//
//  /**Adds values from two Java arrays and returns results as new array object.
//   * Assumes that each array is non-null and has same dimensions.
//   */
//  final def add[@specialized(Int, Double, Float, Long) T]( data1: Array[T],
//                                                     data2: Array[T] ): Array[T] =
//    data1.synchronized {
//      data2.synchronized {
//        var c = 0
//        val tempReturn = new Array[T](data1.length)
//        while c < data2.length do //By using data2.length here, ensures (data1.length == data2.length) is necessary to run correctly
//          tempReturn(c) = data1(c) + data2(c)
//          c += 1
//        end while
//        tempReturn
//      }
//    }
//
//  final def addTo[@specialized(Int, Double, Float, Long) T]( data1: Array[T],
//                                                       data2: Array[T] ): Unit =
//    data1.synchronized
//      data2.synchronized {
//        //loggerRequire( data1.length == data2.length, "Data length unequal!" )
//
//        var c = 0
//        while c < data1.length do
//          data1(c) = data1(c) + data2(c)
//          c += 1
//        end while
//      }
//
//  // </editor-fold>


}
