Arrays:
=======

1. Definition: An array in Java is a data structure that stores a fixed-size, ordered collection of elements of the same data type. Arrays provide a convenient way to group related data items under a single name. The elements in an array are accessed using an index, starting from 0. Arrays are useful for efficiently managing and manipulating large sets of data.

2. Explanation: Declaration: Arrays are declared with a type, followed by square brackets ([]). Example: int[] numbers; Initialization: Arrays can be initialized when declared or later using the new keyword. Example: int[] numbers = new int[5]; Accessing Elements: Elements in an array are accessed using their index (starting from 0). Example: int firstNumber = numbers[0]; Length of Array: The length of an array is obtained using the length attribute. Example: int arrayLength = numbers.length;


String Creation in Java
=======================

1. String Literal:
When you create a string using string literals (e.g., String name = "TestLeaf";), Java stores it in the String Pool, a special area in the Java heap memory.
If another string with the same value is declared (e.g., String name2 = "TestLeaf";), Java reuses the string from the pool instead of creating a new object.
This is efficient in terms of memory.

2. String Instantiation (with new keyword):
When strings are created using the new keyword (e.g., String str = new String("TestLeaf");), a new object is created in the heap memory outside the String Pool.
This means even if two strings have identical values, they will be different objects in memory (e.g., str and str2).



String Comparison in Java
1. Using == Operator:
The == operator checks for reference equality, meaning it checks whether two references point to the same object in memory.
For example, name == str checks if the string literal and the string object created with new refer to the same memory location, which they do not, hence it prints "Both are not equal".

2.Using equals Method:
The equals method checks for value equality, meaning it compares the contents of the strings.
For example, str and str2 are different objects, str.equals(str2) returns true because their contents are the same. Thus, it prints "Both are equal".

3.Using equalsIgnoreCase Method:
This method compares two strings, ignoring case differences.
In the example, name.equalsIgnoreCase(name2) returns true because it ignores the case of the characters. Thus, it prints "Cases ignored and both are equal", assuming name2 is intended to be "TestLeaf" for case difference demonstration.


Notes on Java String Behavior
=============================
Immutability: Strings in Java are immutable. Once created, their values cannot be changed. Any modification results in a new string.
Efficiency: Using string literals is often more memory-efficient due to the String Pool mechanism.
Case Sensitivity: By default, string comparison in Java is case-sensitive. Use equalsIgnoreCase for case-insensitive comparisons.


Steps to execute program in debug mode
======================================
1. add breakpoint in line which is required.
   --> do double click on the left side panel (near numbers)
   --> ctrl+shift+b 

2. right click --> debug as --> java application.
3. Keys used for debug
         q  hen only able to use

         --> resume the debug --> f8 --> jump to next breakpoint.

ShortCut 
--------
   run --> ctrl + f11
   debug --> f11