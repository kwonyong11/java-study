package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		
		try {
			//1. 서버소켓 생성
			serverSocket=new ServerSocket();
			
			//2. 바인딩(binding): Socket Address(IP Address + Port)
			InetSocketAddress inetSocketAddress=new InetSocketAddress("127.0.0.1",5000);
			serverSocket.bind(inetSocketAddress);
			
			//3. accept
			serverSocket.accept(); // blocking
			
			System.out.println("dfsdfsdfsdf");
		} catch (IOException e) {
			System.out.println("[server] error:" + e);
		}finally {
			try {
				if(serverSocket != null && serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
