package com.company;

class A {
    protected String a = "Da";

    protected X x = new X("XXXX");

    A(String val, X x) {
        a = "A: " + val;
        this.x = x;
    }

    public void printState() {
        System.out.println("Current state: " + a);
        System.out.println("Current state: " + x.getX());
    }
}
