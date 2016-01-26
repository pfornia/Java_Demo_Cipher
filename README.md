## Caesar Cipher Decryption

Work in progress.

Written by Paul Fornia October 18th, 2015

Last Updated January 26th, 2016

This program serves as a small demo of Java. The cipher.java script decrypts a string encrypted by the <a href="https://en.wikipedia.org/wiki/Caesar_cipher">Caesar cipher</a>.

The program assumes that punctuation, numbers, and special characters are not encrypted, and lower- and upper- case letters are treated identically.

For now, the program also assumes a "shifted" decryption key. For example, if A --> B, then B --> C and C --> D, in which case we'd say the key uses a shift of 1. Under this assumption, there are only 26 possible keys. 

If we were to remove this assumption, the number of possible keys increases to 26! = 4.03*10^26. Fun fact: if we could decrypt a message in just 3 CPU clock cycles (or perhaps we could decrypt in 300 CPU cycles with 100 processors running in parallel), and used the fastest processor in the world (about 8.8 GHz), it would take us over 4 billion years (or about the age of the earth) to solve this problem by "brute force", trying every possible key. By contrast, if we could use clever tricks to figure out half the letters, bringing the count of possible keys down to 13!, the remaining problem could be solved in about 2 seconds.