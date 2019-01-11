package com.oldmee.status.impl;

import com.oldmee.machine.GumballMachine;
import com.oldmee.status.State;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 16:58 2019/1/11
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("WinnerState:错误信息");
    }

    public void ejectQuarter() {
        System.out.println("WinnerState:错误信息");
    }

    public void turnCrank() {
        System.out.println("WinnerState:错误信息");
    }

    public void dispense() {
        System.out.println("恭喜你，你免费又获得了一颗糖果");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("糖果卖完");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
