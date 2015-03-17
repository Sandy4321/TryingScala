package com.example

/**
 * Created by tales on 17/03/15.
 */
object Main extends App{

  somaInt()
  concatStr()

  def somaInt() = {

    var l1 = List(1, 2, 3, 4, 5, 6)
    var l2 = List(1, 2, 3, 4, 5, 6)

    def soma(intA: Int, intB: Int) = {
      val s = intA + intB
      s
    }

    val l = (HighOrderFunctions.mergeFunction(l1, l2)(soma))

    println(l1)
    println(l2)
    println(l)
    println()

  }

  def concatStr() = {

    var l1 = List("b", "c", "d", "f", "g")
    var l2 = List("a", "e", "i", "o", "u")

    def concatena(strA: String, strB: String) = {
      val s = strA + strB
      s
    }

    val l = (HighOrderFunctions.mergeFunction(l1, l2)(concatena))

    println(l1)
    println(l2)
    println(l)
    println()

  }

}
