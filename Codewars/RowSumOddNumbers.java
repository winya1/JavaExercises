/* Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

1 -->  1
2 --> 3 + 5 = 8 */

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        int odd = 1;
        for (int i = 0; i < n; i++) {
          sum = n*n*n;
          }
        return sum;
        }
      
    }
