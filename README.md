# Scala ClassCastException with Generics and Comparable

This repository demonstrates a subtle bug in Scala involving generics and the Comparable interface. The code compiles successfully but throws a `ClassCastException` at runtime if the generic type `T` does not implement `Comparable`.  The solution showcases how to handle this situation gracefully using type constraints or runtime checks.

## Bug Description
The `MyClass` class defines a method `myMethod` that uses `compareTo` to compare two instances of `MyClass`.  This relies on the implicit assumption that `T` implements `Comparable`. However, if `T` does not, a `ClassCastException` occurs during runtime.

## How to Reproduce
1. Clone this repository.
2. Compile and run `bug.scala`.  You'll observe the exception when the code attempts to compare integers.
3. Examine `bugSolution.scala` for the corrected version.

## Solution
The solution uses an implicit evidence parameter to enforce the type constraint that `T` must implement `Comparable` at compile-time, thus preventing the runtime exception. Alternatively, a runtime check can be implemented to detect and handle this case, which is illustrated in the bugSolution.scala file.
