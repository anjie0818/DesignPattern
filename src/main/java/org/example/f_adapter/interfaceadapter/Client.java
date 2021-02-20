package org.example.f_adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                super.m1();
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();


//        如果直接实现接口需要实现所有的抽象方法
//        Interface4 i = new Interface4() {
//            public void m1() {
//
//            }
//
//            public void m2() {
//
//            }
//
//            public void m3() {
//
//            }
//
//            public void m4() {
//
//            }
//        }
    }
}
