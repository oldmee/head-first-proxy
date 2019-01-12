package com.oldmee.machine;

import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:05 2019/1/12
 */
public class GumballMachineTestDriver {
    public static void main(String[] args) {
        Registry registry;
        try {
            registry = LocateRegistry.createRegistry(8888);
            registry.bind("A-GumballMachine", new GumballMachine("A", 3));
            registry.bind("B-GumballMachine", new GumballMachine("B", 3));
            registry.bind("C-GumballMachine", new GumballMachine("C", 3));
            System.out.println("注册完成");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
