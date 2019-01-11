package com.oldmee.machine;

import com.oldmee.status.State;
import com.oldmee.status.impl.*;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 11:24 2019/1/11
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    /**
     * 放入25分钱
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    /**
     * 退回25分钱
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * 转动曲轴准备出糖果
     */
    public void turnCrank() {
        state.turnCrank();
        if (state.getClass().getName().contains("SoldState") || state.getClass().getName().contains("WinnerState")) {
            state.dispense();
        }
    }

    /**
     * 发放糖果
     */
    public void releaseBall() {
        System.out.println("发糖果中......发放完毕");
        if (count != 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }
}
