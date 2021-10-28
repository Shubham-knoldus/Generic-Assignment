import org.scalatest.funsuite.AnyFunSuite

class TestStackDS extends AnyFunSuite {

  val stacktest = new StackDS

  test("Push the element in the stack"){
    stacktest.push(10)
    stacktest.push(12)
    assert(stacktest.top == 12)
  }
  test("pop the element"){

    stacktest.push(12)
    stacktest.push(13)
    val poptest = stacktest.pop()
    assert(poptest == 13)

  }
  test ("TEest the top Function"){
    stacktest.push(12)
    stacktest.push(13)
    val toptest = stacktest.top()
    assert((toptest == 13))
  }

  test("IsEmpty testing"){
    stacktest.push(12)
    stacktest.push(13)
    stacktest.pop()
    stacktest.pop()
    assert(stacktest.IsEmpty() == true)
  }

}
