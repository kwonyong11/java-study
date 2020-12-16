package chatting;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.io.Writer;

public class ChatServer {
	static final String SERVER_IP="127.0.0.1";
	static final int PORT=7000;
	
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		List<Writer> listWriters=new ArrayList<Writer>();
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind( new InetSocketAddress( SERVER_IP, PORT ) );
			log("연결 기다림"+SERVER_IP+":"+PORT);
			
			while(true) {
				Socket socket=serverSocket.accept();
				new ChatServerThread(socket,listWriters).start();
			}
		}catch (IOException e) {
			System.out.println("[server] error:" + e);
		}finally {
			try {
				if(serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void log(String message) {
		System.out.println("[HttpServer#" + Thread.currentThread().getId()  + "] " + message);
	}
}
