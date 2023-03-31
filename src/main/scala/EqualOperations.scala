
package com.knoldus

class EqualOperations {

  // method for .eq() to
  def dotEq(list1: List[Int], list2: List[Int]): Boolean = {
    list2.eq(list1)
  }

  //method for .equals()
  def dotEquals(list1: List[Int], list2: List[Int]): Boolean = {
    list2.equals(list1)
  }

  //method for ==
  def doubleEqualSymbol(list1: List[Int], list2: List[Int]): Boolean = {
    list2 == list1
  }

  //method for .ne()
  def dotNe(list1: List[Int], list2: List[Int]): Boolean = {
    list1.ne(list2)
  }

  //method for !=
  def notEqualSymbol(list1: List[Int], list2: List[Int]): Boolean = {
    list1 != list2
  }


}

