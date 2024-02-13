package Sockets;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Waiting for clients ......");
		ServerSocket ss;
		try {
			ss = new ServerSocket(9800);
			Socket soc= ss.accept();
			System.out.println("Connection established");
			BufferedReader in =new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str=in.readLine();
			PrintWriter out =new PrintWriter(soc.getOutputStream(),true);
			out.println("server says : "+str);
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
