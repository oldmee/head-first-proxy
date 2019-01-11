package com.oldmee.status.impl;

import com.oldmee.machine.GumballMachine;
import com.oldmee.status.State;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 14:21 2019/1/11
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("投币>>>");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("没钱退个毛啊");
    }

    public void turnCrank() {
        System.out.println("没钱转个毛啊");
    }

    public void dispense() {
        System.out.println("没给钱发个毛糖果啊");
    }
}
