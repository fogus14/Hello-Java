package com.fogus14.tutorial.jrmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String sayHello(String str) throws RemoteException;
}
