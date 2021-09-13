package com.fogus14.tutorial.jrmi.client;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClientApplication {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1234);
            Hello hello = (Hello) registry.lookup("hello");
            hello.sayHello("good");
        } catch (RemoteException e) {
            System.out.println("통신 도중 에러 발생.");
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
