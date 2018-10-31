# Kotlin
# Sample Kotlin Demo For beginners<br>
1.Android Sample Demo <br>
2.Android ListView<br>
3.Android RecyclerView<br>
4.Android MVP Pattern<br>
5.Android JobScheduler <br>
6.Android JobDispatcher
# How to convert java code to Kotlin 
Please check video <br>
https://www.youtube.com/watch?v=zuH9FGwIw5E

Add Suggestions in issues of which demo you want 


# Kotlin Interview Questions  <br>

### Explain Kotlin’s Null safety? 
In Kotlin, the Null safety is used to eliminate the risk of countering the NullPointer exception in real time. <br>

## Which type of Programming does Kotlin support? 
Kotlin supports only two types of programming, and they are: <br>
Procedural programming <br>
Object-oriented programming <br>

## What’s init block in Kotlin
init is the intialiser block in Kotlin. It’s executed once the constructor is instantiated.

## What are the features you think are there in Kotlin but not in Java ?
Kotlin has quite a number of features that Java doesn’t. To name some of them, they are

1. Extension Functions
2. Null Safety / Safe Calls
3. Smart casts
4. Range expressions
5. Operator Overloading
6. Data classes
7. Companion Objects
8. Coroutines
9. scoping functions

## 1. Extension Functions

```
public class Calculator
{
    public fun add(a:Int,b:Int):Int
    {
        return a*b
    }
}

fun Calculator.multiply(a:Int,b:Int):Int
{
    return a*b
}

fun main(args: Array<String>) {
	val calc=Calculator()
    calc.add(4,5)
    calc.multiply(4,5)
}
```
## 2. Null Safety & Safe Calls (?.)

Another way of using a nullable property is safe call operator ?.
This calls the method if the property is not null or returns null if that property is null without throwing an NPE (null pointer exception).

nullableVariable?.someMethodCall()
Safe calls are useful in chains. For example, if Bob, an Employee, may be assigned to a Department (or not), that in turn may have another Employee as a department head, then to obtain the name of Bob’s department head (if any), we write the following

bob?.department?.head?.name
Such a chain returns null if any of the properties in it is null.

To perform a certain operation only for non-null values, you can use the safe call operator together with let

```
val listWithNulls: List<String?> = listOf(“A”, null)
for (item in listWithNulls) {
 item?.let { println(it) } // prints A and ignores null
}
```
Elvis Operator (?:)
This one is similar to safe calls except the fact that it can return a non-null value if the calling property is null even

val result = nullableVariable?.someMethodCall()
                       ?: fallbackIfNullMethodCall()
The Elvis operator will evaluate the left expression and will return it if it’s not null else will evaluate the right side expression. Please note that the right side expression will only be called if the left side expression is null.

Note that, since throw and return are expressions in Kotlin, they can also be used on the right-hand side of the Elvis operator. This can be very handy, for example, for checking function arguments

```
fun foo(node: Node): String? {
 val parent = node.getParent() ?: return null
 val name = node.getName() ?: throw IllegalArgumentException(“name expected”)
 // …
}
```
The !! Operator
This operator is used to explicitly tell the compiler that the property is not null and if it’s null, please throw a null pointer exception (NPE)

nullableVariable!!.someMethodCall()

## Smart Casts
In many cases, one does not need to use explicit cast operators in Kotlin, because the compiler tracks the is-checks and explicit casts for immutable values and inserts (safe) casts automatically when needed:

```
fun demo(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
}

```
## Scoping functions
<br>

###  Apply

```
// old way of building an object

val andre = Person()
andre.name = "andre"
andre.company = "Viacom"
andre.hobby = "losing in ping pong"
// after applying 'apply' (pun very much intended)
val andre = Person().apply {
    name = "Andre"
    company = "Viacom"
    hobby = "losing in ping pong"
}
```
<br>
