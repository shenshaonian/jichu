package 项目中学习到的;


import org.junit.Test;

public class char转int {

    /**
    * https://www.cnblogs.com/daleyzou/p/9510334.html
     *
     *
    * */

    @Test
    public void test1(){

        char ch = '9';
        if (Character.isDigit(ch)){  // 判断是否是数字
            int num = Integer.parseInt(String.valueOf(ch));
            System.out.println(num);
        }
    }

    @Test
    public void test2(){
        char ch = '9';
        if (Character.isDigit(ch)){  // 判断是否是数字
            int num = (int)ch - (int)('0');
            System.out.println(num);
        }
    }


}
