package 项目中学习到的;

import org.junit.Test;

public class 空指针 {

    private Boolean hfMockSwitch;
    @Test
    public void test(){
//           hfMockSwitch = null;
           hfMockSwitchEnable();
    }

    private boolean hfMockSwitchEnable(){
        return hfMockSwitch && true;
    }
}
