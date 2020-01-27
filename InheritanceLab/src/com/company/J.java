package com.company;

class J extends I {
    protected String j;

    J(String val, X x) {
        super(val, x);
        j = "B: " + val;
    }

    public void printState() {
        System.out.println("Current state: " + j);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}
