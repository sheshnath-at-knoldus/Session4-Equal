package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class EqualOperationsTest extends AnyFunSuite {

  val instanceOfEqualOperations = new EqualOperations
  val list1 = List(12, 3, 14, 78, 23)
  val list2 = List(12, 22, 53, 64, 75, 65)

  test("Test case for doteq .eq") {
    val actualResult = instanceOfEqualOperations.dotEq(list1,list2)
    val expectedResult = false
    assert(actualResult === expectedResult)
  }

  test("Test case for dotequals .equals") {
    val actualResult = instanceOfEqualOperations.dotEquals(list1, list2)
    val expectedResult = false
    assert(actualResult === expectedResult)
  }

  test("Test case for double equal Symbol == ") {
    val actualResult = instanceOfEqualOperations.doubleEqualSymbol(list1, list2)
    val expectedResult = false
    assert(actualResult === expectedResult)
  }

  test("Test case for dot .ne()") {
    val actualResult = instanceOfEqualOperations.dotNe(list1, list2)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  test("Test case for not Equal Symbol !=") {
    val actualResult = instanceOfEqualOperations.notEqualSymbol(list1, list2)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }
}
