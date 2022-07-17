package com.leetcode

class LRUCache(private val capacity: Int) {

  private var head: Node
  private var tail: Node
  private val keyToNode = mutableMapOf<Int, Node>()

  init {
    if (capacity < 1) {
      throw IllegalArgumentException("Capacity should be more than 0")
    }
    head = Node(-1, -1, null, null)
    tail = Node(-1, -2, null, head)
    head.previous = tail
    tail.next = head
  }

  private data class Node(
    val value: Int,
    val key: Int,
    var previous: Node?,
    var next: Node?
  )

  fun get(key: Int): Int {
    val node = keyToNode[key] ?: return -1
    removeNode(node)
    putHeadNode(node)
    return node.value
  }

  fun put(key: Int, value: Int) {
    if (keyToNode.containsKey(key)) {
      val node = Node(value, key, null, null)
      val old = keyToNode[key]!!
      removeNode(old)
      putHeadNode(node)
    } else {
      if (capacity == keyToNode.size) {
        val node = Node(value, key, null, null)
        putHeadNode(node)
        removeNode(tail.next!!)
      } else {
        val node = Node(value, key, null, null)
        putHeadNode(node)
      }
    }
  }

  private fun removeNode(node: Node) {
    keyToNode.remove(node.key)
    node.previous?.next = node.next
    node.next?.previous = node.previous
  }

  private fun putHeadNode(node: Node) {
    keyToNode[node.key] = node
    node.next = head
    node.previous = head.previous
    node.previous?.next = node
    head.previous = node
  }
}
