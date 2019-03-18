# Creating a linked list from scratch

In this project a linked list is made from nodes. Each node can only store one reference type i.e. `Integer` or `String` and has to have a tail. A tail can either be another node or the value `null` to mark the end of the linked list.

---

## Defining a linked list

The following linked list stores the values 1 and 2

```java
Node<Integer> list = new Node<>(1, new Node<>(2, null)); 
```

This next linked list stores strings instead of integers

```java
Node<Integer> list = new Node<>(“I”, new Node<>(“am”, new Node<>(“Groot”, null))); 
```

## Printing

The method `printData` displays the data stored in the linked list

```java
Node<Integer> list = new Node<>(“I”, new Node<>(“am”, new Node<>(“Groot”, null))); 
System.out.println(list.printData());
```

The output being:

```
[I,am,Groot]
```

## Adding nodes

You can add nodes to either the front or back of the linked list using the methods `addFront` and `addBack`. Both have to be implemented slightly differently.

To add to the back of the linked list you can simply call the method `addBack` specifying the data you want the node to have.

```java
Node<Integer> list = new Node<>(1, new Node<>(2, null));
list.addBack(3);
System.out.println(list.printData()); 
```
In this example I have added a node containing the integer 3 to the end of the linked list and have printed its data so the outcome would be:

```
[1,2,3]
```
Note that adding to the back of the list is linear `O(n)` as it has to iterate through all the nodes to identify whether the tail is equal to `null`. In the case that the tail is `null` then a new node can be added to the end.

Another approach is to add data to the front of the linked list using `addFront`.

```java
Node<Integer> list = new Node<>(1, new Node<>(2, null));
Node<Integer> newList = list.addFront(0);
System.out.println(list.printData());
```

`addFront` returns a new linked list and therefore needs to be stored in a new node which will have the updated head node containing the specified data. The result of this is:

```
[0,1,2]
```
