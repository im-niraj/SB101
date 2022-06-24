package question2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileRead {

	public static void main(String[] args) throws IOException {
		try {
			FileReader f = new FileReader("abc.txt");
			int res = f.read();
			
			while(res != -1) {
				System.out.print((char)res);
				res = f.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

//----- output --- 
//  Keep your face to 
//  the sunshine and 
//  you cannot see a 
//  shadow.
//  – Helen Keller