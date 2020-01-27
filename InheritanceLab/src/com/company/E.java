package com.company;

class E extends D {
    protected String e;

    E(String val, X x) {
        super(val, x);
        e = "E: " + val;
    }

    public void printState() {
        System.out.println("Current state: " + e);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}
