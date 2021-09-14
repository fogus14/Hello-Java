package com.fogus14.tutorial.jrmiHomework.Server;

import java.rmi.RemoteException;

public class ServerIF2Impl implements ServerIF2 {

    private String message;

    public ServerIF2Impl(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() throws RemoteException {
        return this.message;
    }

}
