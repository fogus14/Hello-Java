package com.fogus14.tutorial.jrmi.server;

import javax.naming.Name;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServerApplication {
    public static void main(String[] args) {
        try {
            Hello hello = new HelloImpl();
            Registry registry = LocateRegistry.createRegistry(1234);
            registry.rebind("hello", hello);
            System.out.println("Hello 원격 객체를 registry에 등록완료.");
            System.out.println("클라이언트에서 호출 대기중.");
        } catch (RemoteException e) {
            System.out.println("통신 도중 에러 발생.");
            e.printStackTrace();
        }
    }
}
