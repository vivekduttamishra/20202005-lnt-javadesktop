package demo01.helloworldawt;

import java.awt.Button;
import java.awt.Frame;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Frame frame=new Frame("Hello Awt Frame and Window");
		
		frame.setSize(800, 600);
		
		
		
		Button clickButton=new Button("Click Me");
	
		
			
		//the button is not yet associated with the form!
		
		//let us put button on the form
		frame.add(clickButton);  
		
		//notice we haven't said where to add it. we haven't specified the size or position the Button
		
		
		frame.setVisible(true);
		
		System.out.println("Application Started...");
		
		System.in.read();
		frame.dispose();
		
	}

}
