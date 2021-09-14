package com.fogus14.tutorial.jrmiHomework.Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject {
	
	protected Server() throws RemoteException{
		super();
	}
	
	public static String message;

	public static void main(String[] args) {
		try {
			Naming.rebind("setserver", new ServerIFImpl(message));	// 앞 파라미터 == '난 이 이름으로 사용할거야~', 뒷 파라미터 == 그에 대한 객체 표기
			Naming.rebind("getserver", new ServerIF2Impl(message));
			System.out.println("Server is ready !!!");
		} catch(RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}

	}
	
}
