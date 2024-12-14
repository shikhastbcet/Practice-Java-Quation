package Array;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Written_lst_data_to_list_out_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst = new ArrayList();
		lst.add("One");
		lst.add("Two");
		lst.add("Three");
		lst.add("Four");
		lst.add("Five");
		lst.add("Six");
		lst.add("Seven");
		lst.add("Eight");
		lst.add("Nine");
		lst.add("Ten");

		try {
			FileOutputStream fos = new FileOutputStream("./list.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lst);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println("Written lst data to list.out file.");

	}
	}


