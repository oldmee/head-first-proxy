package com.oldmee.machine;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 11:24 2019/1/11
 */
public class GumballMachine_old {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine_old(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 放入25分钱
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("别塞钱了，里面有钱");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("你放入了25分钱");
        } else if (state == SOLD_OUT) {
            System.out.println("别塞钱了，糖果卖完了");
        } else if (state == SOLD) {
            System.out.println("稍等，我们正在为你准备糖果");
        }
    }

    /**
     * 退回25分钱
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("25分钱已经退回");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("机器里没钱，退毛钱");
        } else if (state == SOLD) {
            System.out.println("已经出糖果了，退不了了");
        } else if (state == SOLD_OUT) {
            System.out.println("糖果都卖完了，怎么还能退钱呢，开玩笑吧你");
        }
    }

    /**
     * 转动曲轴准备出糖果
     */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("已经转过了，正在出糖果，你还转个毛啊");
        } else if (state == NO_QUARTER) {
            System.out.println("没付钱转个毛啊");
        } else if (state == SOLD_OUT) {
            System.out.println("糖都没了，你还转个毛啊");
        } else if (state == HAS_QUARTER) {
            System.out.println("转动曲轴，准备出糖");
            state = SOLD;
            disspense();
        }
    }

    /**
     * 发放糖果
     */
    public void disspense() {
        if (state == SOLD) {
            System.out.println("出糖果咯~");
            count--;
            if (count == 0) {
                System.out.println("特了累，没糖了");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("理论上不会发生（还没付钱呢）");
        } else if (state == SOLD_OUT) {
            System.out.println("理论上不会发生（卖完了）");
        } else if (state == HAS_QUARTER) {
            System.out.println("理论上不会发生（居然还有钱在里面）");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
