package test;

public class MyTestTwo {
    public static void main(String[] args) {
//        //多个线程同时获取单例对象
//        for (int i = 0; i < 10; i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    //获取
//                    SingletonTest ss = SingletonTest.getInstance();
//                }
//            }.start();
//        }

        SingletonTest ss = SingletonTest.getInstance();
        if(ss == null){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }
}
