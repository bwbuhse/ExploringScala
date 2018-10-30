class LinkedList[A] {

  private class Node(val element: A, var next: Option[Node])

  private var head: Option[Node] = None

  def add(newElement: A): Unit = {
    var node: Option[Node] = head

    if (node.isEmpty) {
      head = Some(new Node(newElement, None))
    } else {
      while (node.get.next.isDefined) {
        node = node.get.next
      }

      node.get.next = Some(new Node(newElement, None))
    }
  }

  def get(index: Int): A = {
    var i = 0
    var node: Option[Node] = head

    while (i < index) {
      node = node.get.next
      i += 1
    }

    node.get.element
  }

  def remove(index: Int): Unit = {
    if (index == 0) {
      var i = 0
      var node: Option[Node] = head

      while (i < index) {
        node = node.get.next
        i += 1
      }

      val temp: Option[Node] = head.get.next

      if (temp.isEmpty) {
        // If there's only one element in the list, set it back to None
        head = None
      } else {
        // Otherwise, set the second element to be the new head
        head.get.next = None
        head = temp
      }
    } else {
      var i = 1

      var before: Node = head.get
      var node: Node = head.get.next.get
      var after: Option[Node] = node.next

      while (i < index) {
        before = node
        node = after.get
        after = after.get.next
        i += 1
      }

      if (after.isEmpty) {
        // Removing a node from the end of the list
        before.next = None
      } else {
        // Removing a node in the middle of the list
        before.next = after
        node.next = None
      }

    }
  }

  def contains(element: A): Boolean = {
    var found = false
    var node: Option[Node] = head

    while (node.isDefined) {
      if (node.get.element == element) {
        found = true
      }
      node = node.get.next
    }

    found
  }

  // Outputs the contents of the list separated by spaces
  override def toString: String = {
    var node: Option[Node] = head
    var string = ""

    while (node.isDefined) {
      string += node.get.element + " "

      node = node.get.next
    }

    string // This returns???
  }
}
