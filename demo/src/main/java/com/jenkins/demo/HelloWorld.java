package com.jenkins.demo;

public class HelloWorld {

    private int number = 0;

    public HelloWorld() {
    }

    public HelloWorld(int theNumber) {
        this.number = theNumber;
    }

    public int getNumber() {
        return number;
    }

    public HelloWorld setNumber(int number) {
        this.number = number;
        return this;
    }
}
