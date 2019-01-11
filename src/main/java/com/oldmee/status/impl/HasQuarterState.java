package com.oldmee.status.impl;

import com.oldmee.machine.GumballMachine;
import com.oldmee.status.State;

import java.util.Random;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 14:40 2019/1/11
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random();
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("里面已经有钱了，别再放钱进来了");
    }

    public void ejectQuarter() {
        System.out.println("退钱中......退钱成功");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("转动摇杆");
        int winner = randomWinner.nextInt(2);
        if ((winner == 0) && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
