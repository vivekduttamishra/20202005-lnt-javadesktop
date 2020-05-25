package demo01.helloworldawt;

import java.awt.Frame;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Frame frame=new Frame("Hello Awt World");
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		System.out.println("Application Started...");
		
		System.in.read();
		frame.dispose();
		
	}

}
