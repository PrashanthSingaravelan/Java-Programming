package com.mycompany.inner_class;

class OuterClass {
  int x = 10;
  static class InnerClass { int y = 5; }
}

public class program_2 {
    public static void main(String[] args) {
    OuterClass obj1= new OuterClass();
    System.out.println(obj1.y);
  }
}

