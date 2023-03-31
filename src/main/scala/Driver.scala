package com.knoldus

object Driver extends App{

  private val instanceOfEqualOperations = new EqualOperations
  val list1 = List(12,3,14,78,23)
  val list2 = List(12, 22, 53,64, 75, 65)

  private val resultOfDotEquals =instanceOfEqualOperations.dotEquals(list1,list2)
  private val resultOfDotEq =instanceOfEqualOperations.dotEq(list1,list2)
  private val resultOfDoubleEquals=instanceOfEqualOperations.doubleEqualSymbol(list1,list2)
  private val resultOfDotNe=instanceOfEqualOperations.dotNe(list2,list1)
  private val resultOFNotEqualSymbol=instanceOfEqualOperations.notEqualSymbol(list2,list1)

  private val list3 = List(12,3,14,78,23)

  private val resultOfDotEqualsForSame = instanceOfEqualOperations.dotEquals(list3, list1)
  private val resultOfDotEqForSame = instanceOfEqualOperations.dotEq(list3, list1)
  private val resultOfDoubleEqualsForSame=instanceOfEqualOperations.doubleEqualSymbol(list1,list3)
  private val resultOfDotNeForSame = instanceOfEqualOperations.dotNe(list1, list3)
  private val resultOFNotEqualSymbolForSame = instanceOfEqualOperations.notEqualSymbol(list1, list3)

  /*
  result for different List
   */
  println("Result of DotEq =>"+resultOfDotEq)
  println("Result of DotEquals =>"+resultOfDotEquals)
  println("Result Of Double Equal Symbol=> "+resultOfDoubleEquals)
  println("Result of Dot Ne =>"+resultOfDotNe)
  println("Result of Not Equal Symbol =>"+resultOFNotEqualSymbol)

  println("\nFor the same list\n")
  /*
  result for  Same List
   */
  println("Result of DotEq =>" + resultOfDotEqForSame)
  println("Result of DotEquals =>" + resultOfDotEqualsForSame)
  println("Result Of Double Equal Symbol=> " + resultOfDoubleEqualsForSame)
  println("Result of Dot Ne =>" + resultOfDotNeForSame)
  println("Result of Not Equal Symbol =>" + resultOFNotEqualSymbolForSame)

}
