package com.oldmee.server;

import com.oldmee.status.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 12:52 2019/1/12
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws  RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
