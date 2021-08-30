package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example2 {

	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("f:\\report.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
