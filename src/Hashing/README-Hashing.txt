Hashing mainly used to implement Dictionaries, where we have key-value pairs.

Also used to implement SETS where we have only Set of keys.
Hashing provides Search, Insert & Delete in O(1) time.
Hashing only have unique values, no duplicates allowed.
If a key already exists and if you try to insert value, it will override the previous key.
All other data structures are beaten by Hashing when we have these (Search, Insert & Delete) operations.

For eg-
In case of Array, let's see few operations -

[Search]
If the Key are in unsorted order, the searching going to be O(n) i.e., Linear time.
If the Key are in sorted order, the searching going to be O(logn)

[Insert]
To insert you'll have to move, so O(n)

[Delete]
Same reason as above

-----------------------
Hashing is not used for
-----------------------
- Finding the closest value (AVL or RedBlack Tree Used)
- Sorted Data (AVL or RedBlack Tree Used)
- Prefix searching (like finding out all the Keys that match with a particular prefix, Hashing is not used - Better to use "Trie" data Structure)

-----------------------
Application of Hashing -
-----------------------
Hashtable (which used underlying data Structure as Hashing) is mostly used data structure in Computer Science.

1. Used in implementation od Dictionaries

2. Database Indexing
Databases uses indexing to quickly find records (primary indexing, secondary indexing).
These indexing can be implemented in two ways.
i - B/B+ trees
ii - Hashing

3. Cryptography
Website login, they store password in the form of Hash values.

4. Caches

5. Symbol tables in Compilers/Interpreters

6. Routers
When connected to home devices, the router maps every device to it's IP address with Hashing

7. Getting data from databases

8. And much more...

---------------------
Direct Address Table
---------------------
Whole idea of Hashing is based on this direct address table concept.
Idea is to use keys as an index in array, then do search, insert & delete in O(n) time.

We could simply use a boolean array.
0 -> means the element is not present.
1 -> means element is present.

Problems with direct address tables -
1. Works only when keys have small values.
2. Does not work when kes are large, like using keys as Phone number of employees
3. Does not work for floating point numbers, eg - 20.51 -> this can't be used as an index in array.
4. Does not work for String values.
This is where the idea of hashing comes in...

If you have big universe of values like, Phone Numbers, Names, Employee IDs.
So hashing take these values, and use a function called "Hash Function", convert these large keys into small values
that can be used as an index in an array.

How does Hash Functions Work?
-----------------------------
There are few requirement of these hash Functions, every time you generate some value, it should generate the same index.

Should generate value from 0 to m-1 (m is the size of Hash Table)

Should be fast, O(1) for integers and O(len) for String of length "len"

Should uniformly distribute large keys into HashTables slots

Collision Handling
------------------

Hash Functions can be written in many ways, eg - modulo based hash functions etc.
But there is also a good change that the universe is big and hash table is small, so two key might map to same entry in hashTable.

[Birth day paradox] : If there are 23 people in a room, there is 50% probability that 2 people have same birth Day.
If no. of people is 70, changes go up to 99.9%

If you know the data in advance then there is a method called "Perfect Hashing" that can solve this problem.

But we'll be mostly working on values that are not known, for which we can use Chaining, Open Addressing.

1. Chaining - We make a chain of colliding items.

2. Open Addressing -
We use the same array, and if the position is occupied, we try to put the key in some other slot.
So the minimum requirement of Open Addressing is we should have at-least same HashTable Size to that of keys which we are inserting.
It is cache friendly because we are using the same Array.
There are multiple way to do implement Open Addressing -
- Linear Probing
- Quadratic Probing
- Double Hashing

[Always select the Hashtable size a Prime Number value]

Chaining
--------

Performance of Chaining -

m = no. of slots in hashTable
n = no. of keys to be inserted

Load Factor (alpha) means how big you want your hash table to be, usually recommended keeping it small.
Load factor = n/m

Double Hashing
--------------
In this we use two hash functions, onr hash function is the original Hash Function.
Another Hash Function to find the next slot, while searching for free slot.

It also distributes keys more uniformly as compared to Linear probing & Quadratic probing.

hash(key,i) = (h1(key) + ih2(key)) % m

where,
h1(key) = (key % 7)
h2(key) = 6 - (key % 6)

also, h2(key) & m should be relatively prime.


Chaining VS Open Addressing
---------------------------
1. Hash Table never gets fills || Table may become full and resizing becomes mandatory.
2. Less sensitive to Hash Functions || Extra care required for clustering.
3. Poor cache performance || Cache friendly
4. Extra space for links || Extra space might be needed to achieve same performance as Chaining.


























