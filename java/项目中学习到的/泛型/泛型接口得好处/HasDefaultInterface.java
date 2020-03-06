package 项目中学习到的.泛型.泛型接口得好处;

import 项目中学习到的.泛型.泛型接口得好处.bean.HasValueInterface;

public interface HasDefaultInterface<T> extends HasValueInterface {
    T getDefault();
}
