package com.fogus14.tutorial.jrmiHomework.Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerIF extends Remote {
	void setMessage(String msg) throws RemoteException;
}