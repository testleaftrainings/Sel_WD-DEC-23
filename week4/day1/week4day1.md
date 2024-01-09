Todays Agenda!!
================
   09:30 - 10:00 - List
   10:00 - 10:15 - Classroom
   10:15 - 11:00 - Set
   11:00 - 11:15 - Classroom
   11:15 - 11:25 - Break
   11:25 - 12:30 - java keywords
   After 12:30   - Recap


















Collection: Set
===============

Definition:
The Set interface in Java is a part of the Java Collections Framework.
It represents a collection that cannot contain duplicate elements.

Properties of Set:
No Duplicate Elements: Ensures that each element in the Set is unique.
Unordered Collection: Except for some specific implementations like LinkedHashSet or TreeSet, the Set does not guarantee the order of its elements.

Implementation Classes:
-----------------------

HashSet:
Maintains a random order

LinkedHashSet:
Maintains insertion order of elements.

TreeSet:
Maintains sorted order


Why There is No get() in Set:
The Set interface does not have a get() method, and this is by design, due to the following reasons:
Uniqueness Over Indexing: The Set is designed to ensure uniqueness rather than maintain an index-based system like List. Elements in a Set are not accessed by an index.
Undefined Ordering: In most implementations of Set, the order of elements is not fixed. Therefore, retrieving an element by a specific index or position does not make sense.