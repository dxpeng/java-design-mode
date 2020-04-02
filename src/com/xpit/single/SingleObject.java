package com.xpit.single;

/**
 * 单例类
 */
public class SingleObject {
    // 设置私有构造方法
    private SingleObject() {
    }

    // 创建类对象实例
    private static SingleObject instance = new SingleObject();

    // 获取类对象实例
    public static SingleObject getInstance() {
        return instance;
    }

    // 方法
    public void say() {
        System.out.println("单例类");
    }
}
