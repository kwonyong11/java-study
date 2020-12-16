package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClientReceiveThread extends Thread{
	private BufferedReader bufferedReader;
	public ChatClientReceiveThread(BufferedReader br) {
		this.bufferedReader=br;
	}
	@Override
	public void run() {
		try{
			while(true) {
				String data=bufferedReader.readLine();
				System.out.println(data);
				if(data==null) {
					break;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.exit(0);
		}
		
	}
	
	
}
