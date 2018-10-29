package com;

public class Main {
    public static void main(String[] args) {
        new Main().someMethod(-5);
    }

    private void someMethod(int a) {
        assert (a > 0);
        // do something with a
        System.out.println(a);
    }
}
