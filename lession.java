class Solution {
    public void reverseString(char[] s) {
        /**
            递归要有一个终止的条件
            这里的终止条件就是每次进行计数，当计数等于数组的长度的一半的时候就结束了
        */
        arraySplit(0,s);
    }

    private static void arraySplit(int index,char [] str) {
        if(index == str.length/2) {
            // 循环结束的条件，每次传入的值等于数组的长度
            return;
        }
        // 传入的值不是数组的长度，那么就进一步的循环。
        // 这里就需要把数组的值进行交换，在交换的时候需要注意一下，index 和数组自身的长度是有计算值的
        char tmp = 'a';
        tmp = str[index];
        str[index] = str[str.length - index + 1];
        str[str.length - index + 1] = tmp; 
        System.out.print(str);
        arraySplit(index+1,str);
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
