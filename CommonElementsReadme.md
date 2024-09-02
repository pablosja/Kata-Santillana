+----------------+
| CommonElements |
+----------------+
| + main(args: String[]): void |
| + findCommonElements(array1: int[], array2: int[]): int[] |
+----------------+


+----------------+       +------------------------+
| CommonElements |       | findCommonElements     |
+----------------+       +------------------------+
        |                          |
        | main(args)                |
        |-------------------------->|
        |                          |
        |                          |
        | findCommonElements(array1, array2) |
        |-------------------------->|
        |                          |
        |                          |  Create set1
        |                          |  Populate set1 with array1 elements
        |                          |
        |                          |  Iterate over array2
        |                          |  Check if element exists in set1
        |                          |  Add common elements to commonElements
        |                          |  Convert commonElements to result array
        |                          |
        |                          |  Return result array
        |                          |
        | <-------------------------|
        |                          |
        | Print common elements    |
        |-------------------------->|
        |                          |
        |                          |
