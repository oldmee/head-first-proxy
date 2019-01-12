package com.oldmee.status.impl;

import com.oldmee.machine.GumballMachine;
import com.oldmee.status.State;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 14:38 2019/1/11
 */
public class SoldOutState implements State {
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("糖果卖完了，别放钱了");
    }

    public void ejectQuarter() {
        System.out.println("糖果都卖完了，怎么可能还退钱");
    }

    public void turnCrank() {
        System.out.println("糖果都卖完了，转个屁的摇杆啊");
    }

    public void dispense() {
        System.out.println("糖果都卖完了，还发个屁啊");
    }

    @Override
    public String toString() {
        return "SoldOutState";
    }
}
