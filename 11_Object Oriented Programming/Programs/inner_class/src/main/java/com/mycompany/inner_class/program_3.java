package com.mycompany.inner_class;

class OuterClass {
    private int x = 10;
    class InnerClass { public int myInnerMethod() { return x; }  }
}

public class program_3 {
    public static void main(String args[]) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}
