package Assessment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

 

public class Seriliazation_1 {

		   public static void main(String[] args) throws ClassNotFoundException, IOException {
		      String s = "Zombadee Shikha";
		      int i = 1234567899;
		     
		         // create a new file with an ObjectOutputStream
		         FileOutputStream out = new FileOutputStream(".txt");
		         ObjectOutputStream oout = new ObjectOutputStream(out);
		         // write something in the file
		         oout.writeObject(s);
		         oout.writeObject(i);
		         // close the stream
		         oout.close();
		         // create an ObjectInputStream for the file we created before
		         ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".txt"));
		         // read and print what we wrote before
		         System.out.println("" +  ois.readObject());
		         System.out.println("" + ois.readObject());
		     
	
}
}
	
