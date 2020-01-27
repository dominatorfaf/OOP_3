package com.company;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(child.age);

        child.foo();
    }
}

class Parent {
    protected int age;
    void foo(){
        System.out.println("");
    }

}

class Child extends Parent {

}
