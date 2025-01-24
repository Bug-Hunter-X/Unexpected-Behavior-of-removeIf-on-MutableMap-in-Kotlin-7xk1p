# Unexpected Behavior of removeIf on MutableMap in Kotlin

This repository demonstrates a subtle but potentially problematic difference in the behavior of the `removeIf` function when applied to `MutableList`, `MutableSet`, and `MutableMap` in Kotlin.  While `removeIf` works consistently for lists and sets, its application to maps can produce unexpected results.

The `bug.kt` file showcases the issue. The `removeIf` function operates on the *value* of the map entry, not on the key-value pair as one might intuitively expect. This can lead to errors if the intention was to remove entries based on a condition involving the key or a combination of key and value.

The `bugSolution.kt` file offers a potential solution, demonstrating how to correctly remove entries from a `MutableMap` based on a specific condition applied to both key and value.   This solution utilizes an iterator to allow for safe removal during iteration.