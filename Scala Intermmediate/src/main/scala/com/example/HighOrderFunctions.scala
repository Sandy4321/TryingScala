package com.example

/**
 * Created by tales on 17/03/15.
 */
object HighOrderFunctions {

  def mergeFunction[T](lista1: List[T], lista2: List[T]) (operate:(T, T) => T ) = {

    if (lista1.length != lista2.length) {
      throw new IllegalArgumentException("Lists must have same length");
    }

    var lista = List[T]()

    for (index <- 0 to lista1.length - 1) {

      lista = lista.:+(operate( lista1(index), lista2(index) ))

    }

    lista
  }

}
