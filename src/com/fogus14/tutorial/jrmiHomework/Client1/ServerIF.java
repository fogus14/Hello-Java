package com.fogus14.tutorial.jrmiHomework.Client1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerIF extends Remote{
	void setMessage(String msg) throws RemoteException;
}