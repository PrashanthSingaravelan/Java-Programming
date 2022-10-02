package com.mycompany.inner_class;

class OuterClass {
    int x = 10;
    class InnerClass { int y = 5; }
}

public class program_1 {
public static void main(String[] args) {
    OuterClass myOuter            = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
