package com.company;

class C extends B {
    protected String c;

    C(String val, X x) {
        super(val, x);
        c = "C: " + val;
    }

    public void printState() {
        System.out.println("Current state: " + c);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}
