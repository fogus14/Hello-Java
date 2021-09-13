package com.fogus14.tutorial.jrmi.server;

import java.rmi.RemoteException;

public class HelloImpl implements Hello{
    @Override
    public String sayHello(String str) throws RemoteException {
        return "Hello World " + str + " !";
    }
}
