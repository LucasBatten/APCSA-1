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

### Step 1 - Break down what we are looking at:

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

Looking at spaces and stars, it looks like they always add up to 7 characters divided between spaces and stars. We could use either the number of stars or spaces to control our loop. 

* If we choose stars we go from 6 down to 0.
* If we choose spaces we go from 1 to 7 

With spaces and stars neither of these have an advantage. So lets look at the next column, slash. Slash goes from 12 down to 0. When comparing that with the two options he currnently have, it might stand out that `6*2 = 12`, `5*2 = 10` ... `0*2 = 0`. That looks to be a better fit than using 1 to 7. So, let's get started

### Step 2 - lay out some basic plans

First make a class to hold your program and add some comments for your basic plan.

```java
public class ProjectOne {
   public static void main( String[] args ){
      // print the line
         // print the beginning stars
         // print the beginning spaces
         // print the slashes
         // print the backslashes
         // print the ending spaces
         // print the ending stars
   }
}
```

### Step 3 - Start at the first step. Printing the lines

```java
public class ProjectOne {
   public static void main( String[] args ){
      // print the line
      for( int i = 6; i >= 0; i-- ) {
         System.out.print( "line: " + i ); // we will remove this later, it helps keep track of where we are for debugging
         // print the beginning stars
         // print the beginning spaces
         // print the slashes
         // print the backslashes
         // print the ending spaces
         // print the ending stars
         
         System.out.println();
      }
   }
}
```

If you run this you will get the following output:

```
line: 6
line: 5
line: 4
line: 3
line: 2
line: 1
line: 0
```

Looks good!

### Step 4 - Identify Constants

Already, we have added a [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)). Remove that now by pulling out the 6 into a constant.

```java
public class ProjectOne {
   public static int MAX_LINE_INDEX = 6;
   public static void main( String[] args ){
      // print the line
      for( int i = MAX_LINE_INDEX; i >= 0; i-- ) {
         System.out.print( "line: " + i ); // we will remove this later, it helps keep track of where we are for debugging
         // print the beginning stars
         // print the beginning spaces
         // print the slashes
         // print the backslashes
         // print the ending spaces
         // print the ending stars
         
         System.out.println();
      }
   }
}
```

Bonus step: make sure this still works after your code change. And, of course, if you have working code, it is a good time to commit in github.

### Step 5 - Print the beginning stars

Add a for loop for the number of stars to print. Remember the combined number of stars and spaces is 7.

Using code fragments here to save some space.

```java
      // print the line
      for( int i = MAX_LINE_INDEX; i >= 0; i-- ) {
         System.out.print( "line: " + i ); // we will remove this later, it helps keep track of where we are for debugging
         
         // print the beginning stars
         for( int j = i; j > 0; j-- ){
            System.out.print( "*" );
         }
         
         // print the beginning spaces
         
         // print the slashes
         // print the backslashes
         // print the ending spaces
         // print the ending stars
         
         System.out.println();
      }
```

This will produce the output 
```
line: 6******
line: 5*****
line: 4****
line: 3***
line: 2**
line: 1*
line: 0
```

Remember the line number part is extra, we will remove that later. Also, it is worth noting that the i and j variable names don't help much here. You do need to be able to work with them since it looks like a lot of the test content uses i and j. If you want something more descriptive in your own programs, you can use better names.

### Step 6 - Print the beginning spaces

Go back and look at the table we are looking for the spaces to have a pattern

| line | i | spaces |
|------|---|--------|
| 1    | 6 | 1      |
| 2    | 5 | 2      |
| 3    | 4 | 3      |
| 4    | 3 | 4      |
| 5    | 2 | 5      |
| 6    | 1 | 6      |
| 7    | 0 | 7      |

The relationship between i (current line counter) and the number of spaces is `7 - i`

```java
         // print the beginning stars
         for( int j = i; j > 0; j-- ){
            System.out.print( "*" );
         }
         
         // print the beginning spaces
         for( int j = 0; j < (7-i); j++ ){
            System.out.print( "-" );
         }
         
         // print the slashes
```

It is hard to spaces, notice that we put in "-" temporarily to see them in the output.

The output for this looks like: 

```
line: 6******-
line: 5*****--
line: 4****---
line: 3***----
line: 2**-----
line: 1*------
line: 0-------
```

### Step 7 - pull out the magic numbers

We introduced a new number to represent how many total characters were in the stars and spaces combined. Pull that value into a constant

```java
   public static int MAX_LINE_INDEX = 6;
   public static int SPACES_STARS_LENGTH = 7;
   public static void main( String[] args ){
```

```java
         // print the beginning spaces
         for( int j = 0; j < (SPACES_STARS_LENGTH - i); j++ ){
            System.out.print( "-" );
         }
```


