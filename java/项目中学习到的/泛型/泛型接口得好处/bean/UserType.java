package 项目中学习到的.泛型.泛型接口得好处.bean;

import com.qingqing.common.exception.ConvertException;
import 项目中学习到的.泛型.泛型接口得好处.HasDefaultInterface;

public enum UserType implements HasDefaultInterface<UserType> {

    /**
     * <code>unknown_user_type = -1;</code>
     *
     * <pre>
     *5.0.5
     * </pre>
     */
    unknown_user_type(0, -1),
    /**
     * <code>student = 0;</code>
     */
    student(1, 0),
    /**
     * <code>teacher = 1;</code>
     */
    teacher(2, 1),
    /**
     * <code>ta = 2;</code>
     */
    ta(3, 2),
    /**
     * <code>guest = 3;</code>
     */
    guest(4, 3),
    /**
     * <code>admin = 4;</code>
     *
     * <pre>
     * 运营端
     * </pre>
     */
    admin(5, 4),
    /**
     * <code>system = 5;</code>
     */
    system(6, 5),
    /**
     * <code>expert_user_type = 8;</code>
     *
     * <pre>
     *专家
     * </pre>
     */
    expert_user_type(7, 8);

    private int index;
    private int value;

    private UserType(Integer index,Integer value) {
        this.index = index;
        this.value = value;
    }

    public static final UserType valueOfIndex(Integer index){
        for (UserType u : UserType.values()){
            if (u.getIndex() == index){
                return u;
            }
        }
        return null;
        // throw new
//        throw new ConvertException("cannot convert student balance change type to user balance log type, changeType:" + changeType);
    }


    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public UserType getDefault() {
        return unknown_user_type;
    }

    public int getIndex() {
        return index;
    }

//    public static UserType
}
