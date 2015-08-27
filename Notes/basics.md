Java Programming Basics
=======================

##Types

List all primitive types in Java.

Is `String` a primitive type?

Explain the difference between `String`, `StringBuffer`, and `StringBuilder`.

##Exceptions

Explain the difference between checked and unchecked exceptions.

Give an example of a checked exception.

Give an example of an unchecked exception.

##Other terminology

Explain *overloading* and *overriding*.


##Static

Which of the following two programs will result in an error? Why?


Program 1:

```java
public class StaticOne {
	private int number;
	
	public static void main(String[] args) {
		this.number = 5;
	}
}
```

Program 2:

```java
public class StaticTwo {
	private static int number;
	
	public void setNumber() {
		this.number = 1;
	}
	
	public static void main(String[] args) {
		(new StaticTwo()).setNumber();
	}
}
```

##Inheritance and Polymorphism

What is the difference between an abstract class and an interface?

```java
public abstract class Beverage {

	protected int ounces;
		
	public int getSize() {
		return this.ounces;
	}
	
	public void drink() {
		System.out.println("Mmm, tasty");
	}

	public abstract String getServingGlass();
}

public class Coffee extends Beverage {
	
	protected boolean isDecaf;
	
	public Coffee(boolean isDecaf) {
		this.isDecaf = isDecaf;
	}
	
	public String getServingGlass() {
		return "Cup";
	}
	
	public boolean isDecaf() {
		return this.isDecaf;
	}	

	public void drink() {
		System.out.println("Wow, that's hot!");
	}
}
```
Consider the Beverage and Coffee classes above. What are the outputs of the following fragments of code? If the code will cause an error, explain the error.


```java
Coffee c = new Coffee(false);
System.out.println(c.getSize());
```

```java
Beverage b = new Beverage();
System.out.println(b.getSize()); 
```

```java
Beverage b = new Coffee(false);
System.out.println(b.isDecaf())
```

```java
Beverage b = new Coffee(false);
b.drink();
```

```java
Beverage b = new Coffee(false);
System.out.println(b.getServingGlass());
```



