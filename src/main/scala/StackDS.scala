import scala.sys.error

class StackDS extends Stack[Int] {
  override var NoOfElement: Int = -1
  override var stack1 = List[Int]()

  def push(value: Int):List[Int] = {
    NoOfElement = NoOfElement+1
    stack1 = value :: stack1
    stack1
  }

  def top(): Int = {
    if (NoOfElement < 0) {
      error("stack is empty")
    }
    else {
      stack1.head
    }
  }

  def pop(): Int = {
    if (NoOfElement < 0) {
      error("stack is empty")
    }
    else {
      NoOfElement = NoOfElement-1
      val element = stack1.head
      stack1 = stack1.tail
      element
    }
  }

  def IsEmpty(): Boolean = {
    if (NoOfElement < 0) {
      true
    }
    else{
      false
    }
  }


}
