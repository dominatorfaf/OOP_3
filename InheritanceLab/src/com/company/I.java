package com.company;

class I extends H {
    protected String i;

    I(String val, X x) {
        super(val, x);
        i = "I: " + val;
    }

    public void printState() {
        System.out.println("Current state: " + i);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}
