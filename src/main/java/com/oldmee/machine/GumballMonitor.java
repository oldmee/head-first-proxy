package com.oldmee.machine;

import com.oldmee.server.GumballMachineRemote;

import java.rmi.RemoteException;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 9:32 2019/1/12
 */
public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("糖果机所在地：" + gumballMachine.getLocation());
            System.out.println("糖果机糖果数量：" + gumballMachine.getCount());
            System.out.println("糖果机目前状态：" + gumballMachine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
