package com.oldmee.server.impl;

import com.oldmee.server.MyRemote;

import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 10:42 2019/1/12
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    public String sayHello() {
        return "hello RMI";
    }

    /*public static void main(String[] args) {
        Registry registry;
        try {
            registry = LocateRegistry.createRegistry(8080);
            MyRemote service = new MyRemoteImpl();
            registry.bind("RemoteHello", service);
//            Naming.bind("RemoteHello", service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }*/
}
