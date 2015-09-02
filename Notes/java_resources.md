New to Java?
============

If you are completely new to Java it is highly recommended that you familiarize yourself with the language before you jump into your assignments. The first Java program you ever write should **not** be your Lab 1 solution. Instead, spend your weekend writing several Java programs until you understand the syntax and features of the language. Then, begin your work on Lab 1. 

###You will have to write code you do not submit!
I know that you don't want to write *extra code*, however it will be worth your time. Even when you know a language well, if you want to learn a new library or feature of that language you should write some sample programs to understand how the feature works **before** you try to integrate it into your real code.

###Become proficient at using online resources
One of the things you **must** learn in this course is how to use resources available to you, particularly online resources. If you don't know how to do something, use Google to help you out. Of course, you shouldn't copy solutions, however here is a perfectly acceptable example situation:

1. You realize you have no idea how to create and use a HashMap in Java.
2. You type "java hashmap" into Google, and click the first result.
3. The first result I see is this page: [https://dzone.com/articles/hashmap-%E2%80%93-single-key-and](https://dzone.com/articles/hashmap-%E2%80%93-single-key-and) It has a complete example of a Java class that uses a HashMap.
4. I create a new Eclipse Java project and copy this example. Note, I have no intention of ever submitting this code as my own!
5. I run the code and see how it works. Then, I modify the code, adding and removing additional statements, until I really understand what the code is doing. Maybe this takes me 30 minutes to one hour. 
6. Now, I am ready to use HashMaps in my own code.

###A few resources to get you started
There is a lot of information on Google and you will need to become proficient and finding resources, reading lots of information, and extracting the information that is most useful for your situation.

 - Start here: [Java 101](http://www.javaworld.com/article/2076075/learn-java/core-java-learn-java-from-the-ground-up.html). Read and understand this article.
 - Work through some of these examples:
   * [Data Structures and Algorithms part 1](http://www.javaworld.com/article/2073390/core-java/datastructures-and-algorithms-part-1.html)
   * [Classes and Objects](http://www.javaworld.com/article/2075202/core-java/object-oriented-language-basics-part-1.html) 
- Try some of these small online tutorials: [Learn Java Online](http://www.learnjavaonline.org/).
- Maybe watch a few [YouTube videos](https://www.google.com/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=java+tutorials+youtube).
- Try some of the [Program By Doing] (https://programmingbydoing.com/) problems.
- Once you are comfortable with writing and executing small Java programs, learn more about Java [Collections] (https://docs.oracle.com/javase/tutorial/collections/TOC.html).

###Preparing to get help from the instructor
You have lots of opportunities for help, but please try to take advantage of class time, office hours, and additional hack hours I schedule. This means you should *work on your assignments before class/office hours so that you will be prepared with questions*. Don't wait until after my last office hour of the week to begin work on then hope I can schedule a separate meeting with you as my schedule may or may not allow it!

##A few words on Lab 1
Your goal for Lab 1 is to design an efficient, in-memory data structure to store the information that is inserted via the `add` methods provided.

You  may find it helpful to think of the `YelpStore` as analogous to a database. A developer will construct a `YelpStore` object and then read and write data to that object. For Lab 1, your only goal is to design the data structure that will allow efficient reads and writes. Eventually, the `YelpStore` will serve as an in-memory cache that will be used by a web service.

Consider this similar problem. Suppose I asked you to design an efficient, in-memory data structure to store a directory of users and their phone numbers. 

The skeleton for this exercise is as follows. The `add` method takes as input a user and phone number and the `get` method returns the phone number for the user provided.


```java
public class PhoneBook {

	public PhoneBook() { 		
	}
	
	public void add(String user, String phone) {	
	}
	
	public String getPhone(String user) {		
		return null;
	}
}
```

Your job is to fill out this class. 

The first step is to decide how to store the user and phone data. Your initial thought might be to create a `Person` class with data members `user` and `phone`. You could then use an `ArrayList` to store `Person` objects. When the `add` method is called, you create a new `Person` and append it to the end of the list. This is a O(1) operation (yay!).

Unfortunately, when the `get` method is called you will need to iterate over the entire list to find the person with the name matching the `String` passed as a parameter. This is an O(n) operation, so you might think about whether you could make this more efficient.

To make your `get` method more efficient you could use a `HashMap`. You realize that, if you use a `HashMap` you actually don't even need your `Person` class. You can make the user's name the key for your map and the value will be the phone. When `add` is called, you invoke the `put` method of `HashMap` and when `get` is called you invoke the `get` method of `HashMap`. 

Once you decide on this design, you code up a solution that might look something like the following.  

```java
import java.util.HashMap; //must import anything not in java.lang

public class PhoneBook {

	//declare variable to maintain the data structure
	HashMap<String, String> directory;
	
	public PhoneBook() {
		//initialize data structure
		this.directory = new HashMap<>();
	}
	
	public void add(String user, String phone) {
		//insert a value
		this.directory.put(user, phone);
	}
	
	public String getPhone(String user) {
		//return value
		//make sure to return correct value if 
		//user not present
		return this.directory.get(user);
	}
}
```