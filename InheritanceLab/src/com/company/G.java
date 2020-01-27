package com.company;

class G extends F {
    protected String g;

    G(String val, X x) {
        super(val, x);
        g = "G: " + val;
    }

    public void printState() {
        System.out.println("Current state: " + g);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}
