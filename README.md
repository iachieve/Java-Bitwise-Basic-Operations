# java Bitwise Operator Summary
    & - bitwise and
    | - bitwise or
    ^ - bitwise xor
    ~ - bitwise not
    << - bitwise shift left
    >> - bitwise shift right
##### Binary numbers are zero indexed.

##### Bitwise AND (&):

|   A	|  B 	|  A&B 	|
|---	|---	|---	|
|  1 	|  1 	|  1 	|
|  1 	|  0 	|  0 	|
|  0 	|  1 	|  0 	|
|  0 	|  0 	|  0 	|


##### Bitwise OR (|):

|   A	|  B 	|A OR B |
|---	|---	|---	|
|  1 	|  0 	|   1	|
|  1 	|   1	|   1	|
|  0 	|   1	|   1	|
|  0	|   0	|   0	|


##### Bitwise XOR (^):

|   A	|  B 	|A ^ B |
|---	|---	|---	|
|  1 	|  0 	|   0	|
|  1 	|   1	|   1	|
|  0 	|   1	|   0	|
|  0	|   0	|   1	|

##### Bitwise NOT (~):

| A  | ~A  |
|---|---|
|  1 | 0  |
|  0 | 1  |
##### Left Shift ( << ):
- shift two binary digits from the left and append two binary digits from the right
- (0000 0001 << 1) =>  (0000 0010)
```java
     System.out.println(Integer.toBinaryString(1 << 1));
    // outputs 10
```
- left shifting a number by i multiplies that number with 2^i
```java
        System.out.println(2 << 1); //  4
        System.out.println(2 << 2); //  8
        System.out.println(2 << 3); //  16
        System.out.println(2 << 4); //  32
        System.out.println(2 << 5); // 64
```
##### Get Bit:
    1- Create mask by left shifting 1 by i numbers
    2- User AND operator
    3- Ex: (num & (1 << i)) != 0
        - 0 means bit is not set
        - 1 means bit is set
```dtd
Ex1:
num = 0000 0110, get 3rd bit.
&
mask= 0000 0100	(1 << i)
--------------------------------------
result: 0000 0100

Ex2:
num = 0000 0010, get 3rd bit.
&
mask= 0000 0100	(1<<i)
--------------------------------------
result: 0000 0000

```

```java
public static void main(String[] args) {
    int n = 5; // 0000 0101
    int k = 3; // 0000 0X00
    // mask       0000 0100
    // result     0000 0100
    System.out.println(Integer.toBinaryString(1 << (k-1)));
    System.out.println(Integer.toBinaryString((n & (1 << (k-1)))));
}

```
##### Set Bit
    1- Create mask by shifting 1 by i numbers
    2- Use OR opertor
    3- Ex: (num | (1 << i)
```dtd
num = 0000 0110
|
mask= 0000 1000
-----------------------
result: 0000 1110

```
##### Clear Bit
    1- create mask of ones except the ith element is 0. [ ~(1 << i) ]
    2- Use AND Operator
    3- Ex: ~(1 << i) & num
    
```dtd
ex: clear 3rd bit in binary number 0000 0110
num  = 0000 0110
&
mask = 1111 1011
----------------
result 0000 0010  
 
``` 
##### Clear ALL Bit
    1- clear from the right: (-1 << i) & num
    2- clear from the left: ((1 << i + 1)-1 & num
    
    
    Ex: clear the right 4 binary digits from 0011 0110
    num =   0011 0110    
    &
    mask =  1111 0000    (1111 1111) << i => same as (-1 << i)
    ----------------
    result: 0011 0000   (-1 << i) & num
    
    Ex: clear the right 4 binary digits from  0011 0110
    num =   0011 0110    
    & 
    mask =  0000 1111   ((1 << i + 1) - 1)
    -----------------
    result: 0000 0110   ((1 << i + 1) - 1) & num
    
# java Bitwise Hacks

##### find negative number of a given number in two's complement representation
    - invert all bit and add one
```dtd
43  00101011
-43 11010101
```


##### check if the number even or odd
```java
    if((x & 1) == 0){
        x is even
    }else{ 
        x is odd
    }
```
```dtd
Intuition:
- An integer is odd if and only if the least significant bit b0 is 1
- by AND-ing 'x' with 1, we eliminate all the other bits than b0
- If the result after this operation is 0, then 'x' was even because b0 was 0, otherwise 'x' was odd
```
```dtd
ex: 43  =>  00101011
    &       00000001    (1 is the same as 00000001)
   result   00000001    odd
   the AND operation erased all the higher order bits b1-b7

ex: 98  =>  1100010
    &       0000001
    res     0000000 even
```

##### Test if the n-th bit is set




