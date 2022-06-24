package question1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("abc.txt");
		try (BufferedReader bf = new BufferedReader(f)) {
			String line = bf.readLine();
			while(line !=null) {
				System.out.println(line);
				line = bf.readLine();
			}
		}
	}

}
