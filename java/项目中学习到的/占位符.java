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

    @Test
    public void test2(){
//        String Str = new String("www.google.fjsdioajfo.google21.google.com");
//        String Str = new String("https://front.changingedu.com/activity/invite_student_modular_page#/form?formid={活动ID}&activity_no=20170828_z1_1_cVK&chid=1001768&student_id={$student_id}&student_city_id={$student_city_id}&assistant_id={$assistant_id}&student_id={$student_id}");
        String Str = "user_id={$student_id}&city_id={$student_city_id}&assistant_id={$assistant_id}";
        System.out.print("匹配成功返回值 :" );
//        System.out.println(Str.replaceAll("google", "runoob" ));
        Str = Str.replaceAll("\\{\\$student_id}", "2134" );
        Str = (Str.replaceAll("\\{\\$student_city_id}", "2134" ));
        Str = (Str.replaceAll("\\{\\$assistant_id}", "2134" ));
        System.out.println(Str);
//        System.out.print("匹配失败返回值 :" );
//        System.out.println(Str.replaceAll("(.*)taobao(.*)", "runoob" ));
    }





}
