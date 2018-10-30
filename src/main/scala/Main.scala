
object Main {

  def main(args: Array[String]) {
    // Creating the list
    val list = new LinkedList[Int]

    // Testing add
    list.add(1)
    list.add(3)
    list.add(-5)
    list.add(8)
    println(list) // 1 3 -5 8
    println(list.get(2)) // -5

    // Testing remove at head
    list.remove(0)
    println(list) // 3 -5 8

    // Adding some more things
    list.add(3)
    list.add(10)
    println(list) // 3 -5 8 3 10

    // Testing remove in the middle and at the tail of the list
    list.remove(1)
    println(list) // 3 8 3 10

    list.remove(3)
    println(list) // 3 8 3

    // Testing contains
    println(list.contains(3)) // true
    println(list.contains(10)) // false

    // Test creating an instance of LinkedList in Java
    A.javaToScala()

  }

}
