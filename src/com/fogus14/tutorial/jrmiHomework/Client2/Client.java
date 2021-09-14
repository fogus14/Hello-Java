package com.fogus14.tutorial.jrmiHomework.Client2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) {
		ServerIF2 server;
		try {
			server = (ServerIF2) Naming.lookup("getserver");		// 어떠한 이름으로 찾아오겠다(lookup())
			System.out.println("Server's answer: " + server.getMessage());
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
