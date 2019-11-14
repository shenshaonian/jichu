package digui;

//private static void printReverse(char [] str) {
//        helper(0, str);
//        }
//
//private static void helper(int index, char [] str) {
//        if (str == null || index >= str.length) {
//        return;
//        }
//        helper(index + 1, str);
//        System.out.print(str[index]);
//        }
public class reverseString {

//    public static void main(String[] args){
//        System.out.println(args);
//        char[] s = {'a','b','c','d'};
//
//        reverseString(s);
//    }
//
//    public static void reverseString(char[] s) {
//        printReverse(s);
//    }
//    private static void printReverse(char[] str) {
//        helper(0,str);
//    }
//
//    private static void helper(int i, char[] str) {
//        if (null == str || i == str.length){
//            return;
//        }
//        helper(i + 1, str);
//        System.out.print(str[i]);
//    }
    public static class Solution {
    public static void reverseString(char[] s) {
        helper(0,s);
    }
    private static void helper(int i, char[] str) {
        if (null == str || i >= str.length){
            return;
        }
        helper(i + 1, str);
        System.out.println(str[i]);
    }
}
public static void main(String[] a){
    char[] s = {'a','b','c','d'};
        Solution.reverseString(s);
}
}
