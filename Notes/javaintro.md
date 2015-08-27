Java in CS 601
==========================================

Java is an object-oriented programming language that is widely used, particularly for backend development as well as development of Android applications.

We will be using Java exclusively in CS 601. By the end of the semester, you will be comfortable writing large, object-oriented programs. Here are some interesting thoughts on [programming languages, job demand, and salaries](http://www.sitepoint.com/best-programming-language-learn-2015-job-demand-salaries/).

If you are new to Java, make sure to bookmark [The Java Tutorials](https://docs.oracle.com/javase/tutorial/).

## Code Quality

It is not enough to implement solutions that produce a correct result. Your grade will also depend upon the quality of your code and you may not qualify for code review unless you follow appropriate [style guidelines](style.md). 

As a developer, it is extremely important that you produce code that is easy to read and easy to maintain. That means that another developer should be able to quickly determine how your code works, how it could be modified to repair bugs, and how it could be extended to support new functionality. 

### Design

Code bases are often hundreds of thousands or [millions of lines of code](http://www.informationisbeautiful.net/visualizations/million-lines-of-code/). Additionally, virtually all software is developed by teams of several people. Applying clear and consistent design principles will ensure you produce functional and maintainable code.

Good design is both art and science. It is something you must practice. By writing lots of code and reading lots of code you will learn to identify good patterns and bad patterns. 

Design of good code will be a topic we discuss in detail over the entire semester. Code review is an opportunity for you and I to discuss your designs and I will provide you with feedback to help you improve.

There are many common principles you should apply when designing code. Several of them have been distilled into acronyms, for example:

[**DRY**](https://en.wikipedia.org/wiki/Don%27t_repeat_yourself)

Don't repeat yourself. My rule of thumb is that if you ever find yourself copy/pasting code you should stop and question whether you could improve your design, for example by moving repeated code into a method or creating a superclass to implement common functionality.

[**KISS**](https://en.wikipedia.org/wiki/KISS_principle)

Keep it simple, silly. Avoid overcomplicated algorithms or implementations when a simpler approach will solve the problem.

[**YAGNI**](https://en.wikipedia.org/wiki/You_aren%27t_gonna_need_it)

You aren't gonna need it. Do not add functionality until it is deemed absolutely necessary.

### Coding Style

You will be expected to follow the style standards here: [Google Java Style](http://google.github.io/styleguide/javaguide.html)

Any company you work for will have its own set of standards and you must adhere to those standards. The Google standards outlined in the document referenced above are fairly common. Pay particular attention to the following:

- Braces are used where optional. Use braces even in the case you have a single statement in an if or loop.
- Class names are written in UpperCamelCase.
- Method names are written in lowerCamelCase.
- Parameter names and local variable names are also written in lowerCamelCase.
- Caught exceptions are not ignored.
- At the minimum, Javadoc is present for every public class, and every public or protected member of such a class.

In addition, you will be expected to do the following:

- Be consistent with spacing. 
- Use try-with-resources when possible. 
- Use private data members unless there is a good reason to do otherwise (e.g., the member is constant).
- Do not catch unchecked exceptions. Instead, use conditionals to avoid the exception (e.g., check whether a variable is null before invoking a method rather than catching a NullPointerException).

## Excercise

Design a Java version of the Unix tool `grep`. 

It will be executed as follows:

```
java Grep pattern filename
```

Normally searching the web for a solution would be a violation of the academic honor code.

For this exercise (and this exercise only!), however, I encourage you to look at the following example solutions I found with a google search.

As you design your solution, think about the good and bad elements of the solutions below.

- Example 1: [Grep.java](http://examples.oreilly.com/9781565921832/section6/Grep.java) | [GrepInputStream.java](http://examples.oreilly.com/9781565921832/section6/GrepInputStream.java)
- Example 2: [Grep.java](https://docs.oracle.com/javase/8/docs/technotes/guides/io/example/Grep.java)
- Example 3: [Grep.java](http://introcs.cs.princeton.edu/java/72regular/Grep.java.html)
- Example 4: [Grep4j.java](https://code.google.com/p/grep4j/source/browse/trunk/src/main/java/org/grep4j/core/Grep4j.java)




 



