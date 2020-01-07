package 练习题;

import org.junit.Test;

public class 等于等于和equal {
    public static final Integer EXAM_PAPER_TYPE = 401;
    @Test
    public void test1(){
Integer i = new Integer(1);
        if ( i == null){
            System.out.println("kdfssnaiofa");;
        }
        Integer t = new Integer(2);
        t = null;
        if (i == t){
            System.out.println("dfasdf");
        }
        System.out.println("lalalal");
        if (EXAM_PAPER_TYPE == t){
            System.out.println("fdasf");
        }
        System.out.println(EXAM_PAPER_TYPE.toString());
        int tt =2;
        System.out.println(i.toString());
    }
}
