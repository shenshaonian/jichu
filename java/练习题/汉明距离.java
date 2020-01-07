package 练习题;

import org.junit.Test;

public class 汉明距离 {
    /**
     * 汉明距离   两个数字对应二进制位不同的位置的数目。
     *              0       1       2       3       4   5   6   7   8   9   10  11  12  13  14  15  16
     *            0000     0001    0010    0011
     * 0    0000    0       1       1
     * 1    0001    1       0       2
     * 2    0010    1       2       0
     * 3    0011    2       1       1
     * 4    0100    1       2       2       3
     * 5    0101    2       1       3
     * 6    0110    2       3       1
     * 7    0111    3       2       2
     * 8    1000    1       2       2
     * 9    1001    2       1       3
     * 10   1010    2       3       1
     * 11   1011    3       2       2
     * 12   1100    2       3       3
     * 13   1101    3       2       4
     * 14   1110    3       4       2
     * 15   1111    4       3       3
     * 16   10000   1       2       2
     * 17
     * 18
    * */

    @Test
    public void test1(){
//        System.out.println("dfasfdasf");

        int x =3;
//        int y = 0;
//        int y = 4;
        int y = 1;
        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        while (x != 0){
            buffer1.append(String.valueOf(x % 2));
            x /= 2;
        }
        buffer1.reverse();
        while (y != 0){
            buffer2.append(String.valueOf(y % 2));

            y /= 2;
        }
        buffer2.reverse();
        int length1 = buffer1.length();
        int length2 = buffer2.length();

        int dif = 0;

        int lenthMore = buffer1.length()>buffer2.length() ? buffer1.length() : buffer2.length();
        int lenghtLess = length1<length2 ? length1: length2;
        for (int i = 1;length1-i>-1 && length2-i>-1 ;i++ ){
            char c1 = buffer1.charAt(length1-i);
            char c2 = buffer2.charAt(length2-i);
            if (c1!=c2)
                dif++;
        }

        for (int i = lenghtLess;lenthMore-i-1>-1; i++){
            if (length1 < length2 && Integer.parseInt(String.valueOf(buffer2.charAt(lenthMore-i-1)))!=0){
                dif++;
            }else if ( length2 < length1 && Integer.parseInt(String.valueOf(buffer1.charAt(lenthMore-i-1)))!=0){
                dif++;
            }

        }
        System.out.println(buffer1);
        System.out.println(dif);
    }




    /**
    * 技巧的 解法
     * https://leetcode-cn.com/problems/hamming-distance/solution/an-wei-yi-huo-pan-duan-er-jin-zhi-wei-zhong-1de-ge/
     * 两数异或，取1数量
    * */

    @Test
    public void test2(){
        int x =3,y=5;
        int count = 0;
        int i =  x ^ y;
        while (i!=0){
            if ((i & 1) ==1){
                count++;
            }
            i = i >> 1;
        }
        System.out.println(count);
    }
}
