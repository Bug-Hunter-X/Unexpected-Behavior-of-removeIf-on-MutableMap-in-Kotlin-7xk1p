```kotlin
fun main() {
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)

    // Correct way to remove items from MutableMap based on a condition 
    map.entries.removeIf { it.value % 2 == 0 }
    println(map) // Output: {a=1, c=3}

    // Alternative approach using an iterator
    val iterator = map.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        if (entry.value % 2 == 0) {
            iterator.remove()
        }
    }
    println(map) // Output: {a=1, c=3}
}
```