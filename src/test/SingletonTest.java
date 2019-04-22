package test;

/**
 * 单例模式线程安全优化实现
 */
public class SingletonTest {
    private static SingletonTest singletonTest = null;

    private SingletonTest(){}

    public static SingletonTest getInstance(){
        if (singletonTest == null){
            synchronized (SingletonTest.class){
                if (singletonTest == null){
                    singletonTest = new SingletonTest();
                }
            }
        }
        return singletonTest;
    }

}
