package com.oldmee;

import com.oldmee.machine.GumballMachine;
import com.oldmee.machine.GumballMachine_old;
import org.junit.Test;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 12:58 2019/1/11
 */
public class GumballMachineTestDriver {

    @Test
    public void gumballMachineWithStateTest() {
        GumballMachine gumballMachine = new GumballMachine(2);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.turnCrank();

    }

    @Test
    public void gumballMachineTest() {
        GumballMachine_old gumballMachine = new GumballMachine_old(5);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();

        gumballMachine.turnCrank();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.disspense();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }
}
