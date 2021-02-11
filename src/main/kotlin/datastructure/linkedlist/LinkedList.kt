package datastructure.linkedlist

class LinkedList(root: Int) {
    private var root = Node(root)

    fun add(value: Int) {
        add(value, root)
    }

    private fun add(value: Int, currentNode: Node) {
        if (currentNode.next != null) {
            add(value, currentNode.next!!)
        } else {
            currentNode.next = Node(value)
        }
    }

    fun add(values: IntArray) {
        var lastNode = getLastNode()
        values.forEach {
            val newNode = Node(it)
            lastNode.next = newNode
            lastNode = newNode
        }
    }

    fun get(index: Int): Node {
        return get(index, root)
    }

    private fun get(index: Int, currentNode: Node): Node {
        val newIndex: Int = index - 1
        return when (newIndex) {
            -1 -> currentNode
            else -> get(newIndex, currentNode.next!!)
        }
    }

    fun length(): Int {
        return length(root, 0) + 1
    }

    private fun length(currentNode: Node, index: Int): Int {
        if (currentNode.next != null) {
            return length(currentNode.next!!, index + 1)
        } else {
            return index
        }
    }

    fun getLastNode(): Node {
        return getLastNode(root)
    }

    private fun getLastNode(currentNode: Node): Node {
        if (currentNode.next != null) {
            return getLastNode(currentNode.next!!)
        } else {
            return currentNode
        }
    }

    fun pop(): Node {
        val secondLastNode: Node = pop(root)
        val toBeReturned: Node = secondLastNode.next!!
        secondLastNode.next = null
        return toBeReturned
    }

    private fun pop(currentNode: Node): Node {
        if (currentNode.next?.next == null) {
            return currentNode
        } else {
            return pop(currentNode.next!!)
        }
    }

    fun dequeue(): Node {
        val toBeReturned:Node = root
        root = root.next!!
        return toBeReturned
    }

    override fun toString(): String {
        return "LinkedList: [${toString(root)}] | Length: ${length()}"
    }

    private fun toString(currentNode: Node): String { // private recursive function to generate toString() return
        return "(${currentNode.value})->${currentNode.next?.let { toString(it) }}"
    }

    // easier to understand but use toString() instead
    fun printAll() {
        print("Linked List Contains: ")
        printAll(root)
        println()
    }

    private fun printAll(currentNode: Node) {
        print("(${currentNode.value})")
        if (currentNode.next != null) {
            print("->")
            printAll(currentNode.next!!)
        }
    }
}