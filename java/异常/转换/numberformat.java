package 异常.转换;

import org.junit.Test;

public class numberformat {

    @Test
    public void ts(){
        String s = "123456222211\\t";
        String s1 = "123456222211  ";
        /**
         * 有空格就会报错
        * */
        Long l = Long.valueOf(s);
        System.out.println(l);
    }
}
