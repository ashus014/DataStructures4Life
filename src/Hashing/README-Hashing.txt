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



















