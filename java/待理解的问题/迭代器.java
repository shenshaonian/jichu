package 待理解的问题;

public class 迭代器 {
    /**  两个请求过来访问的其实是一个List, 对于beans来说, 是两个线程共有的, 对于迭代器来说, 是两个线程私有的,
     * list修改的modCount只会被当前线程同步到expectedModCount, 另外线程会产生不同步, 造成ConcurrentModificationException, 解决办法, 加锁
    **  https://sentry.changingedu.com/qingqing/answersvc/issues/19454/?query=is:unresolved
     *  https://wiki.changingedu.com/pages/viewpage.action?pageId=19961846
     *  图片见D:\selfplace\pic\fix迭代器图
     *
     *  https://gerrit.changingedu.com/#/c/160771/
     * ConcurrentModificationException fix
     */


}
