package exploration.datastructures

class TreeMap[K <: Ordered[K], V] {

  private class Node(
                      val key: K,
                      var value: V,
                      var left: Option[Node] = None,
                      var right: Option[Node] = None
                    )

  private var head: Option[Node] = None

  def put(key: K, value: V): Option[V] = {
    var old: Option[V] = None

    if (head.isEmpty) {
      head = Some(new Node(key, value))
    } else {
      var node = head
      while (node.isDefined) {
        if (key.equals(node.get.key)) {
          old = Some(node.get.value)
          node.get.value = value

          // Just to leave the loop
          node = None
        } else if (key.<(node.get.key)) {
          node = node.get.left
        } else {
          node = node.get.right
        }
      }

      if(old.isEmpty) {
        node.
      }
    }

    old
  }

}
