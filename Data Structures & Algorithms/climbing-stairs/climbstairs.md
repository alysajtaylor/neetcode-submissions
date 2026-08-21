# Climbing Stairs (Fibonacci & Memoization)
This problem is a standard fibonacci as long as you realize the pattern.
I found the pattern initially by writing out the possibilities for n = 4. Then realizing the previous test cases followed the fibonacci sequence.  

    // n = 4 
    // 1 + 1 + 1 + 1     
    // 2 + 2             
    // 2 + 1 + 1           
    // 1 + 2 + 1            
    // 1 + 1 + 2         
    // output: 5
    // fibonacci: 0 1 1 2 3 5 8...

- **Time: O(n)**
- **Space: O(n)**

- Time without memoization would be exponential: O(2^n)  space: O(n)
