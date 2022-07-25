-----
Trie
-----
 Data structure well suited for using dictionaries.

 Efficient for the following operations on words in a dictionary.
 - Search
 - Insert
 - Delete
 - Prefix Search
 - Lexicographical ordering of words

---------------------------------
Comparison between Hashing & Trie
---------------------------------

                        Trie                            Hashing
Search          O(word_len) in worst case        O(word_len) on average
Insert          O(word_len) in worst case        O(word_len) on average
Delete          O(word_len) in worst case        O(word_len) on average
Prefix Search   O(prefix_len + output_len)          Not Supported
Lexicographic   O(output_len)                       Not Supported
Ordering
