package com.fogus14.tutorial.jrmiHomework.Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerIF2 extends Remote {
	String getMessage() throws RemoteException;
}
