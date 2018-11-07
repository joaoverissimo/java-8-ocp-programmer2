# Java 8 OCP Notes and Tests fonts

This is my notes and my fonts of tests in study of JAVA 8 OCP.

## The best reference

I really suggest a read of: http://ocpj8.javastudyguide.com

## Remember

### Main
* Is "psvm": public static void main
* Careful with args. Has tricks like `args[1]` and `java TestClass true`

### Enums

* Constructor need be private
* Constructor does not access non-final static field
* Can not extends another enum or class, just interface
* Never can be defined inside a method or constructor  
* The first thing need be the values os enum (`enum Pets { String name; DOG, CAT; }` does not compile   )

### Runnable

* Need have the run method
* can't throws checked exceptions
* Need be void
* If close method and content of try throws a exception, the exception of close method is supressed

### AutoClosable

* Need implements close
* If dont extends closable/autoclosable dont can be used in trw-with-resources

### Equals and Hashcode

* If has equals, need has hashcode. The code compiles, but when finding the object not found

### Streams

* Be careful witch de terminate method. Never 2 terminate operations
* Look for "asDuble" in primitive streams. Like ToDoubleBiFunction.applyAsDouble (sometimes tricks with just apply, that does not compile)
* Look for "DoublePredicate" in DoubleStream

### Locale

* ptBR: language, country (upper)
* If use `Locale.Builder().setLanguage("pt").setRegion("BR")` is necessary `.build()` method.
* Using `ResourceBundle.getBundle("mymsgs", locPtBR);` first find `mymsgs_pt_BR.properties`, after `mymsgs_pt.properties`, after `mymsgs.properties`. If not found exception at run time.
  
### Assertions

* `assert <boolean_expression> : <any_expression_but_void>;`
* The first expression need be boolean
* Second neeed be any kind of primitive or object, BUT NOT VOID.
* Second can be null

### Java Time

* The classes are tread safe 

### Serialization

* Need implements `Serializable` interface
* If the parent class dont implements `Serializable` the constructors super() is called
* static and transient fields are never serialized

### Concurrency

* Callable and RecursiveTask has return
* Runnable and RecursiveAction does are void

### I/O Fundamentals

* PrintWriter: `write` returns void; `printf & print` returns the  PrintWriter

### collections

* TreeSet/TreeMap needs comparable