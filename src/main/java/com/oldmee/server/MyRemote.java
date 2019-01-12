package com.oldmee.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 10:41 2019/1/12
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
