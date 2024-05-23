Mistakes: While checking the edge case, where I was comparing the character present in first string but not in second string would give me false everytime there is a character difference in the two strings. However, if we have two words that has the same pair of characters in both strings it would give me true even when the strings are different. For example, "cat" and "tac".

Implementation using HashMap involved searching method getOrDefault which gives the count of a particular key. ​
