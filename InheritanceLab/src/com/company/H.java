package com.company;

class H extends G {
    protected String h;
    private X x = new X("lalala");

    H(String val, X x) {
        super(val, x);
        h = "H: " + val;
    }

    public void printState() {
        System.out.println("Current state: " + h);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}
