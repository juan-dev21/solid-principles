package com.jpdev.solid.dip.refactor;

public class LightBulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("LightBulb on");
    }

    @Override
    public void tunOff() {
        System.out.println("LightBulb off");
    }
}
