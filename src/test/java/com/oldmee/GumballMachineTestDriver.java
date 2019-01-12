package com.oldmee;

import com.oldmee.machine.GumballMachine;
import com.oldmee.machine.GumballMonitor;
import com.oldmee.server.MyRemote;
import org.junit.Test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 12:58 2019/1/11
 */
public class GumballMachineTestDriver {

    @Test
    public void rmicTest() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://localhost:8080/RemoteHello");
            System.out.println(service.sayHello());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void moniteTest() throws RemoteException {
        GumballMachine gumballMachine = new GumballMachine("黄土高坡",2);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();
    }

    @Test
    public void gumballMachineWithStateTest() throws RemoteException {
        GumballMachine gumballMachine = new GumballMachine("美国芝加哥",2);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.turnCrank();

    }

}
