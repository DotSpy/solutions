package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LRUCacheTest {

  @Test
  fun leetcodeExample1() {
    val cache = LRUCache(2)
    cache.put(1, 1); // cache is {1=1}
    cache.put(2, 2); // cache is {1=1, 2=2}
    assertEquals(1, cache.get(1));    // return 1
    cache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
    assertEquals(-1, cache.get(2));    // returns -1 (not found)
    cache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
    assertEquals(-1, cache.get(1));    // return -1 (not found)
    assertEquals(3, cache.get(3));    // return 3
    assertEquals(4, cache.get(4));    // return 4
  }

  @Test
  fun leetcodeExample2() {
    val cache = LRUCache(2)
    assertEquals(-1, cache.get(2))
    cache.put(2, 6)
    assertEquals(-1, cache.get(1))
    cache.put(1, 5)
    cache.put(1, 2)
    assertEquals(2, cache.get(1))
    assertEquals(6, cache.get(2))
  }
}
