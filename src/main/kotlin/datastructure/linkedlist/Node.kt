package datastructure.linkedlist

data class Node(val value: Int) {
    var next: Node? = null

    override fun toString(): String {
        return "Node($value)"
    }
}
