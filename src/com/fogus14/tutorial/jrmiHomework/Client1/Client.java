package com.fogus14.tutorial.jrmiHomework.Client1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) {
		ServerIF server;
		try {
			server = (ServerIF) Naming.lookup("setserver"); // 어떠한 이름으로 찾아오겠다(lookup())
			server.setMessage("정래현");
			System.out.println("Message save success!");
			
		} catch (MalformedURLException | NotBoundException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
