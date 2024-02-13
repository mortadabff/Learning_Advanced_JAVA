package Sockets;
import java.io.*;
import java.net.Socket;
public class Client {
	public static void main(String[] args)  {
		System.out.println("Client started  ");

		try {
			Socket soc=new Socket("localhost",9800);
			BufferedReader userInput =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a msg :   ");
			String str=userInput.readLine();
			PrintWriter out =new PrintWriter(soc.getOutputStream(),true);
			out.println(str);
			PrintWriter in =new PrintWriter(soc.getOutputStream());
			String str=in.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
