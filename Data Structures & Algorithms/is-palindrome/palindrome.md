# isPalindrome 
-  Create a **isAlphaNum(char)** helper function rather than use java's built in  **Character.isLetterOrDigit()** 

    With the two pointer approach you must have **2 separate while loops( one for each pointer)** to skip over characters that aren't alphanumeric, then compare them once the pointers point to a valid character/digit.
    Additionally, each **while loop** must include the main while loop condition **(start &lt; end)**.

- String functions used here have O(1) time/space
- Although there are nested while loops, there are only ever N steps as each pointer moves toward each other
- This algorithm is done in place so it does not use any more space
- **Time: O(n)**
- **Space: O(1)**
