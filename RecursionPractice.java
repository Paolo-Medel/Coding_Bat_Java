import java.util.Objects;

public class RecursionPractice {
    public int factorial (int n){
//    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

//    factorial(1) → 1
//    factorial(2) → 2
//    factorial(3) → 6
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int bunnyEars (int bunnies) {
//    We have a number of bunnies and each bunny has two big floppy ears.
//    We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

//    bunnyEars(0) → 0
//    bunnyEars(1) → 2
//    bunnyEars(2) → 4
        if (bunnies == 0){
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
//    The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
//    The first two values in the sequence are 0 and 1 (essentially 2 base cases).
//    Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
//    Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.

    // fibonacci(6)
    //├── fibonacci(5)
    //│   ├── fibonacci(4)
    //│   │   ├── fibonacci(3)
    //│   │   │   ├── fibonacci(2)
    //│   │   │   │   ├── fibonacci(1) → 1
    //│   │   │   │   └── fibonacci(0) → 0
    //│   │   │   └── fibonacci(1) → 1
    //│   │   │   → 1 + 0 = 1, then 1 + 1 = 2
    //│   │   └── fibonacci(2)
    //│   │       ├── fibonacci(1) → 1
    //│   │       └── fibonacci(0) → 0
    //│   │       → 1 + 0 = 1
    //│   │   → 2 + 1 = 3
    //│   └── fibonacci(3)
    //│       ├── fibonacci(2)
    //│       │   ├── fibonacci(1) → 1
    //│       │   └── fibonacci(0) → 0
    //│       │   → 1 + 0 = 1
    //│       └── fibonacci(1) → 1
    //│       → 1 + 1 = 2
    //│   → 3 + 2 = 5
    //└── fibonacci(4)
    //    ├── fibonacci(3)
    //    │   ├── fibonacci(2)
    //    │   │   ├── fibonacci(1) → 1
    //    │   │   └── fibonacci(0) → 0
    //    │   │   → 1 + 0 = 1
    //    │   └── fibonacci(1) → 1
    //    │   → 1 + 1 = 2
    //    └── fibonacci(2)
    //        ├── fibonacci(1) → 1
    //        └── fibonacci(0) → 0
    //        → 1 + 0 = 1
    //    → 2 + 1 = 3
    //
    //→ Final Result: 5 + 3 = 8

        if (n == 0) {
            return 0;
        } else if (n < 3) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
//    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
//    The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
//    Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

//    bunnyEars2(0) → 0
//    bunnyEars2(1) → 2
//    bunnyEars2(2) → 5
        if (bunnies == 0){
            return 0;
        } else if (bunnies % 2 == 0){
            return 3 + bunnyEars2(bunnies - 1 );
        }
        return 2 + bunnyEars2(bunnies - 1);
    }

    public int triangle(int rows){
//    We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on.
//    Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.

//    triangle(0) → 0
//    triangle(1) → 1
//    triangle(2) → 3
        if (rows == 0) return 0;

        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n){
//    Given a non-negative int n, return the sum of its digits recursively (no loops).
//    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

//    sumDigits(126) → 9
//    sumDigits(49) → 13
//    sumDigits(12) → 3
        if (n < 10)
        {
            return n;
        }
        int rightmost_int = n % 10;
        return rightmost_int + sumDigits(n/10);
    }

    public int count7(int n){
//    Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
//    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

//    count7(717) → 2
//    count7(7) → 1
//    count7(123) → 0
        int seven_count = 0;
        if (n == 0)
        {
            return 0;
        }

        int rightmost_value = n % 10;
        if (rightmost_value == 7)
        {
            seven_count++;
        }

        return seven_count + count7(n/10);
    }

    public int count8(int n){
//    Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
//    except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
//    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

//    count8(8) → 1
//    count8(818) → 2
//    count8(8818) → 4
        int eight_count = 0;
        if (n == 0)
        {
            return 0;
        }

        int rightmost_value = n % 10;

        int second_rightmost_value = n % 100;
        int digit_next_to_rightmost_value = second_rightmost_value /10;

        if (rightmost_value == 8)
        {
            eight_count++;
        }
        if (rightmost_value == 8 && digit_next_to_rightmost_value == 8)
        {
            eight_count++;
        }

        return eight_count + count8(n/10);
    }

    public int powerN(int base, int n) {
//        Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

//        powerN(3, 1) → 3
//        powerN(3, 2) → 9
//        powerN(3, 3) → 27
        // Base case: any number to the power of 1 is itself
        if (n == 1) {
            return base;
        }
        // Recursive case: base^n = base * base^(n-1)
        return base * powerN(base, n - 1);
    }

    public int countX(String str) {
//        Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

//        countX("xxhixx") → 4
//        countX("xhixhix") → 3
//        countX("hi") → 0
        if (str.isEmpty()) {
            return 0;
        }

        int xCount = 0;

        int stringLen = str.length();
        String lastChar = str.substring(stringLen - 1);
        System.out.println(stringLen);

        if (Objects.equals(lastChar, "x")) {
            xCount++;
        }

        String newString = str.substring(0, stringLen - 1);

        return xCount + countX(newString);
    }

    public boolean array6(int[] nums, int index) {
//        Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index.
//        In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

//        array6([1, 6, 4], 0) → true
//        array6([1, 4], 0) → false
//        array6([6], 0) → true
        if(nums.length <= index) {
            return false;
        }

        if(nums[index] == 6) {
            return true;
        }

        return array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {
//        Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
//        We'll use the convention of considering only the part of the array that begins at the given index.
//        In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

//        array11([1, 2, 11], 0) → 1
//        array11([11, 11], 0) → 2
//        array11([1, 2, 3, 4], 0) → 0
        if (nums.length <= index) {
            return 0;
        }

        int count = 0;

        if(nums[index] == 11){
            count++;
        }

        return count + array11(nums, index + 1);
    }
}
