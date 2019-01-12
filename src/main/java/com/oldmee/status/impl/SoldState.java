package com.oldmee.status.impl;

import com.oldmee.machine.GumballMachine;
import com.oldmee.status.State;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 14:40 2019/1/11
 */
public class SoldState implements State {
    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("先别放钱，正在出糖果呢");
    }

    public void ejectQuarter() {
        System.out.println("已经出糖果了，退不了了");
    }

    public void turnCrank() {
        System.out.println("正在出糖果了，别转了");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("没糖果了");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "SoldState";
    }
}
