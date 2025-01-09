```scala
class MyClass[T : Ordering](val value: T) {
  def myMethod(other: MyClass[T])(implicit ord: Ordering[T]): T = {
    if (ord.compare(value, other.value) < 0) value else other.value
  }
}

val obj1 = new MyClass[String]("apple")
val obj2 = new MyClass[String]("banana")
println(obj1.myMethod(obj2)) // Works fine

val obj3 = new MyClass[Int](1)
val obj4 = new MyClass[Int](2)
println(obj3.myMethod(obj4)) // Works fine now
```