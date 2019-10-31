package com.java.jt.service2.test;

/**
 * Created by jt on 2019/10/29 17:03
 */
class A {
    static {
        System.out.println("1" + "走到A类的static");
    }

    public A() {
        System.out.println("3" + "走到A类的构造方法");
    }
}

class B extends A {
    static {
        System.out.println("2" + "走到B类的static");
    }

    public B() {
        System.out.println("4" + "走到B类的构造方法");
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new B();
    }
}