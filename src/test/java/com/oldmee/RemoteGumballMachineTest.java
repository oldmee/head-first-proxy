package com.oldmee;

import com.oldmee.machine.GumballMachine;
import com.oldmee.machine.GumballMonitor;
import com.oldmee.server.GumballMachineRemote;
import org.junit.Test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:18 2019/1/12
 */
public class RemoteGumballMachineTest {
    @Test
    public void remoteGumballMachineTest() {

        String[] locations = {"rmi://localhost:8888/A-GumballMachine",
                "rmi://localhost:8888/B-GumballMachine",
                "rmi://localhost:8888/C-GumballMachine"};

        try {
            for (int i = 0; i < locations.length; i++) {
                GumballMachineRemote service = (GumballMachineRemote) Naming.lookup(locations[i]);
                GumballMonitor gumballMonitor = new GumballMonitor(service);
                gumballMonitor.report();
                System.out.println("===================================================================");
            }
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
