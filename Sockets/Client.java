package Sockets;
import java.io.IOException;
import java.net.Socket;
public class Client {
	public static void main(String[] args)  {
		System.out.println("Client started  ");

		try {
			Socket soc=new Socket("localhost",9800);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
