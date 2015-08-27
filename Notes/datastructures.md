Data Structures Review
======================

Understanding data structures and when and how to use them efficiently is extremely important.

In CS 673 you will learn more about implementation strategies. In CS 601 we will focus more on choosing the right data structure to solve a particular problem.

The [Java Collections Framework](https://docs.oracle.com/javase/tutorial/collections/index.html) provides implementations of sets, lists, maps, and several other common data structures.

The [API Specification](http://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collections.html) provides information about the running time of common operations as outlined below.

| Data Structure | Operation | Running Time | Notes |
|:---|:---|:---|:---|
| ArrayList | `size`, `isEmpty`, `get`, `set`, `iterator` | O(1)| | 
| | `add` | *amortized constant time* | Adding n elements requires O(n) time.| 
| | all other operations (`contains`, `indexOf`) | O(n) | | 
| LinkedList | | | Implemented as a doubly-linked list. | 
| HashMap | `get`, `put` | O(1) | Initial capacity and load factor influence performance. | 
|  | iteration | O(n) | | 
| TreeMap | `get`, `put`, `remove`, `containsKey` | O(log(n)) | |
| LinkedHashMap |`add`, `remove`, `contains` | O(1)| Elements are ordered by insertion order. |
| HashSet | `add`, `remove`, `contains`, `size` | O(1) | Does not guarantee order of elements over time. |
| | iteration | O(n) |
| TreeSet | `add`, `remove`, `contains` | O(log(n))| Guarantees elements are sorted. |
| LinkedHashSet | `add`, `remove`, `contains` | O(1)| Elements are ordered by insertion order. *Performance is likely to be just slightly below that of HashSet, due to the added expense of maintaining the linked list, with one exception: Iteration over a LinkedHashSet requires time proportional to the size of the set, regardless of its capacity. Iteration over a HashSet is likely to be more expensive, requiring time proportional to its capacity.* |

## Exercise

Consider a program that reads in a file, processes the file to extract appropriate data, and stores the result in a data structure that may be queried as described below.

Describe the design of the data structure you will use to store the result of processing the file in order to efficiently implement the methods described below, as well as efficiently implement the processing of the file.

```java
/**
  * Returns the total number of words in the document.
  * There are six words in the following document.
  * 'The cat and the dog ran.'
  */
public int getTotalWords();

/**
  * Returns the number of distinct words in the document.
  * There are five distinct words in the following document
  * as the word the appears twice.
  * 'The cat and the dog ran.'
  */
public int getDistinctWords();

/**
  * Returns a list of the 20 most frequently used words.
  */
public String[] getFrequentWords();

/**
  * Returns the number of times the word specified
  * as a parameter appears in the document.
  */
public int getAppearances(String word);

```
