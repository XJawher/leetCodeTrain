class Solution {
    public void reverseString(char[] s) {
        /**
            递归要有一个终止的条件
            这里的终止条件就是每次进行计数，当计数的长度等于数组的长度的时候就终止
        */
        arraySplit(0,s)
    }

    private static void arraySplit(int index,char [] str) {
        if(index == str.length) {
            // 循环结束的条件，每次传入的值等于数组的长度
            return;
        }
        // 传入的值不是数组的长度，那么就进一步的循环。
        // 这里就需要把数组的值进行交换，在交换的时候需要注意一下，index 和数组自身的长度是有计算值的
    }
}

// private static void printReverse(char [] str) {
//   helper(0, str);
// }

// private static void helper(int index, char [] str) {
//   if (str == null || index >= str.length) {
//     return;
//   }
//   helper(index + 1, str);
//   System.out.print(str[index]);
// }
