package 项目中学习到的;

//import com.qingqing.common.domain.PublishRefType;
//import com.qingqing.common.util.CollectionsUtil;
//import org.elasticsearch.common.collect.Lists;
//import org.elasticsearch.common.collect.Maps;
import org.junit.Test;
import 项目中学习到的.LecturePublishAppTypeBeanConvert.LecturePublishAppTypeBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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

//    @Test
//    public void test3(){
//        Map<Long, List<PublishAppType>> map = Maps.newHashMapWithExpectedSize(1);
//        List<PublishAppType> publishAppTypes = new ArrayList<PublishAppType>();
//        PublishAppType appType = new PublishAppType();
//        appType.setId(1L);
//        appType.setRefId(23L);
//        appType.setAppType(3);
//        appType.setRefType(4);
//        publishAppTypes.add(appType);
//        publishAppTypes.add(appType);
//        map.put(appType.getRefId(),publishAppTypes);
//        List<LecturePublishAppTypeBean> lecturePublishAppTypeBeans = toLecturePublishAppTypeBean(map);
//        System.out.println(lecturePublishAppTypeBeans.toString());
//        System.out.println(lecturePublishAppTypeBeans.get(0).toString());
//    }
//
//    public List<LecturePublishAppTypeBean> toLecturePublishAppTypeBean(Map<Long, List<PublishAppType>> lectureId2PublishAppTypes) {
//        if (CollectionsUtil.isNullOrEmpty(lectureId2PublishAppTypes)) {
//            return Collections.emptyList();
//        }
//        List<LecturePublishAppTypeBean> lecturePublishGradeBeans = Lists.newArrayListWithCapacity(lectureId2PublishAppTypes.size());
//        for (Map.Entry<Long, List<PublishAppType>> entry : lectureId2PublishAppTypes.entrySet()) {
//            lecturePublishGradeBeans.add(new LecturePublishAppTypeBean(entry.getKey(), entry.getValue(), PublishRefType.parse(entry.getValue().get(0).getRefType())));
//        }
//        return lecturePublishGradeBeans;
//    }
}
