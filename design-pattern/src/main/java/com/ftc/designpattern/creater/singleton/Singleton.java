package com.ftc.designpattern.creater.singleton;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-03-17 10:20:06
 * @describe: 单例模式实例代码
 */
public class Singleton {

    /**
     * 静态变量私有化
     */
    private static volatile Singleton SINGLETON;

    /**
     * 构造函数私有化
     */
    private Singleton() {
    }

//    /**
//     * 获取单例对象
//     *
//     * @return 单例对象
//     */
//    public static Singleton getSingleton() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    /**
     * 获取单例对象
     *
     * @return 单例对象
     */
    public static Singleton getSingleton() {
        if (SINGLETON == null) {
            synchronized (Singleton.class) {
                if (SINGLETON == null) {
                    SINGLETON = new Singleton();
                }
            }
        }
        return SINGLETON;
    }
}
