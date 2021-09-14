package com.fogus14.tutorial.jrmiHomework.Server;

import java.rmi.RemoteException;

public class ServerIFImpl implements ServerIF {

    private String message;

    public ServerIFImpl(String message) {
        this.message = message;
    }

    @Override
    public void setMessage(String msg) throws RemoteException {
        this.message = msg;
    }

}
