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

# Difference Between Functions

## With vs Apply
```
fun main(args:Array<String>)
{
	var person=Person()
	with(person)
	{
		name="shriyank"
		age=23
	}
	
	person.apply
	{
	   name="Siddhant"
	   age=27
	}.startFunction()
	
	println(person.name)
	println(person.age)
}
clas Person
{
	var name:String?=null
	var age:Int?=null
	
	fun startFunction()
	{
		println("This functions is started")
	}
}

```
<br>
<b>With</b> and <b> Apply </b> both works as same but in case of <b> apply </b> it returns <b>receiver</b>. <br>
Reciever in this case is <b> person </b> <- person.apply <br>
Apart from that, <b> apply </b> have right to call functions of class <b>Person<b> <br>

# What is extensions in view binding ?

The magic behind Kotlin Android Extensions <br>

When you start working with Kotlin, it’s really interesting to understand the bytecode that is being generated when you use one feature or another. This will help you understand the hidden costs behind your decisions.

There’s a powerful action below Tools –> Kotlin, called Show Kotlin Bytecode. If you click here, you’ll see the bytecode that will be generated when the class file you have opened is compiled.

The bytecode is not really helpful for most humans, but there’s another option here: Decompile.

This will show a Java representation of the bytecode that is generated by Kotlin. So you can understand more or less the Java equivalent code to the Kotlin code you wrote.

I’m going to use this on my activity, and see the code generated by the Kotlin Android Extensions.

The interesting part is this one:

```
private HashMap _$_findViewCache;
...
public View _$_findCachedViewById(int var1) {
   if(this._$_findViewCache == null) {
      this._$_findViewCache = new HashMap();
   }

   View var2 = (View)this._$_findViewCache.get(Integer.valueOf(var1));
   if(var2 == null) {
      var2 = this.findViewById(var1);
      this._$_findViewCache.put(Integer.valueOf(var1), var2);
   }

   return var2;
}

public void _$_clearFindViewByIdCache() {
   if(this._$_findViewCache != null) {
      this._$_findViewCache.clear();
   }

}

```
Here it is the view cache we were talking about.

When asked for a view, it will try to find it in the cache. If it’s not there, it will find it and add it to the cache. Pretty simple indeed.

Besides, it adds a function to clear the cache: clearFindViewByIdCache. You can use it for instance if you have to rebuild the view, as the old views won’t be valid anymore.

Then this line:

```
welcomeMessage.text = "Hello Kotlin!"
```
is converted into this:

```
((TextView)this._$_findCachedViewById(id.welcomeMessage)).setText((CharSequence)"Hello Kotlin!");
```

So the properties are not real, the plugin is not generating a property per view. It will just replace the code during compilation to access the view cache, cast it to the proper type and call the method.

Kotlin Android Extensions on fragments
This plugin can also be used on fragments.

The problem with fragments is that the view can be recreated but the fragment instance will be kept alive. What happens then? This means that the views inside the cache would be no longer valid.

Let’s see the code it generates if we move it to a fragment. I’m creating this simple fragment, that uses the same XML I wrote above:

```
class Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        welcomeMessage.text = "Hello Kotlin!"
    }
}

```

In onViewCreated, I again change the text of the TextView. What about the generated bytecode?

Everything is the same as in the activity, with this slight difference:

```
// $FF: synthetic method
public void onDestroyView() {
   super.onDestroyView();
   this._$_clearFindViewByIdCache();
}

// $FF: synthetic method
public void onDestroyView() {
   super.onDestroyView();
   this._$_clearFindViewByIdCache();
}
```

When the view is destroyed, this method will call clearFindViewByIdCache, so we are safe!



# How to use parceable in kotlin?


# Difference between == and === in kotlin?
