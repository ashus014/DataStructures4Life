In JAVA char data type is UTF 16 & stored using 16 bit.

UTF - Unicode Standard Format.

First 128 bit characters and their encoding is same as ASCII.

---------------
Remember this :
---------------

char x = 'a';
System.out.println((int)x);

//OUTPUT - 97

Always use this approach while dealing with Arrays.

------------------------------------------------------------------------------------------------------------------------
Strings in JAVA
---------------

There are 4 ways to create Strings in JAVA.

1. Character Array
char[] arr = ['g','e','e','k','s'];

2. String Class
String str = "geeks";
OR
String str = new String("geeks");

3. StringBuffer Class
StringBuffer str = new StringBuffer("geeks");

4. StringBuilder Class
StringBuilder str = new StringBuilder("geeks");

String Object we create is immutable i.e., content of the String can't be changed.
StringBuffer & StringBuilder allows String Objects to modified.

StringBuffer is a thread safe class.
StringBuilder is not thread safe (extra overhead is not there).

---> See code

When you create JAVA String Objects using literals, JAVA compiler does not allocate
new memory for the literals, if they have same content.
eg -
String s1 = "geeks"
String s2 = "geeks"

Both are immutable here, so compiler does this memory optimization & does not allocate
new memory for the same string content.

Both s1 & s2 both refer to the same content.

"==" compare whether two Objects refers to the same references or not.

So for above eg. if we do s1==s2 we will get "true" because they both refer to the same references.
This is called "String Literal Pool" in JAVA.

More functions -
- s1.contains(s2) - whether s2 string is present in s1.
- s1.equals(s2) - Return "true" if the content of both the String s1 & s2 are same and "false" if not same.
- s1.compareTo(s2) - Compare s1 & s2 lexicographically, if same return 0, if s1 is lexicographically greater -> returns +ve,
if s1 is lexicographically smaller -> returns -ve
- s1.indexOf(s2) - returns -ve if s2 not present in s1, otherwise returns the first occurrence of s2 in s1.
