package datastructure.linkedlist

fun main() {
    val linkedList = LinkedList(7)
    linkedList.add(9)
    linkedList.add(intArrayOf(22, 64, 53, 75, 34, 78, 43))
    linkedList.add(97)
    println(linkedList)
    println("Last node: ${linkedList.getLastNode()}")
    println("Get Node on index 3: ${linkedList.get(3)}")
    println("Pop: ${linkedList.pop()}")
    println(linkedList)
    println("Dequeue: ${linkedList.dequeue()}")
    println(linkedList)
}