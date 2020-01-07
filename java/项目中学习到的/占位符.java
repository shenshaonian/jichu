package 项目中学习到的;

import org.junit.Test;

public class 占位符 {

    @Test
    public void test1(){
        String s = "https://front.changingedu.com/activity/invite_student_modular_page#/form?user_id=%s&city_id=%s";
        String ss = String.format(s,119,222);
        System.out.println(ss);
        System.out.println("dfasfdasf");

//        {$user_id}
        String d = "https://front.changingedu.com/activity/invite_student_modular_page#/form?user_id={$user_id}&city_id={$city_id}";
        d = d.replace("{$user_id}","111");
        d = d.replace("{$city_id}","11221");
        System.out.println(d);


    }





}
