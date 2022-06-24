package question3;

import java.io.FileReader;
import java.io.IOException;

public class CountTheChar {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("abc.txt");
		
		char check = 'U';
		int m = (int)check;
		
		int i = f.read();
		int count = 0;
		while(i != -1) {
			if(m < 97) { 
				m = m+32; //Case insensitive... 'a' and 'A' are considered to be the same
			}
			if(m==i) {
				count++;
			}
			i = f.read();
		}
		System.out.printf("Count of '%c' is : %d",check,count);
	}

}
//Keep your face to 
//the sunshine and 
//you cannot see a 
//shadow.
//– Helen Keller
