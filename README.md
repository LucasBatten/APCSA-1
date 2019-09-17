# APCSA

## Chapter 2 - Excercise 1

```
Write a program that produces the following output using nested for loops:

****** //////////// ******
*****  //////////\\  *****
****   ////////\\\\   ****
***    //////\\\\\\    ***
**     ////\\\\\\\\     **
*      //\\\\\\\\\\      *
       \\\\\\\\\\\\
```

Break down what we are looking at:

| line # | stars | spaces | slash | backslash | spaces | stars |
|--------|-------|--------|-------|-----------|--------|-------|
| 1      | 6     | 1      |  12   | 0         | 1      | 6     |
| 2      | 5     | 2      |  10   | 2         | 2      | 5     |
| 3      | 4     | 3      |  8    | 4         | 3      | 4     |
| 4      | 3     | 4      |  6    | 6         | 4      | 3     |
| 5      | 2     | 5      |  4    | 8         | 5      | 2     |
| 6      | 1     | 6      |  2    | 10        | 6      | 1     |
| 7      | 0     | 7      |  0    | 12        | 7      | 0     |

We have 4 viable options keeping track of the current line in a for loop that will run 7 times
* count from 0 to 6: 0,1,2,3,4,5,6
* count from 1 to 7: 1,2,3,4,5,6,7
* count from 7 down to 1: 7,6,5,4,3,2,1
* count from 6 down to 0: 6,5,4,3,2,1,0

Do some quick calculations to see how you might line up the the current line number with the table above. Keep in mind that we are not printing the line number.



