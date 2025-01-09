```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    // This line causes a ClassCastException if T is not a subtype of java.lang.Comparable
    if (value.compareTo(other.value) < 0) value else other.value
  }
}

val obj1 = new MyClass[String]("apple")
val obj2 = new MyClass[String]("banana")
println(obj1.myMethod(obj2)) // Works fine

val obj3 = new MyClass[Int](1)
val obj4 = new MyClass[Int](2)
println(obj3.myMethod(obj4)) //This compiles but throws runtime error at runtime
```