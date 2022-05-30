package textTransformator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextSaver {
	private TextTransformer transformer;
	private File file = new File("a.txt");

	void saveTextToFile(String text) {
		Scanner sc = new Scanner(System.in);
		
		transformer = new TextTransformer();
		String buff = transformer.transform(text);
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(PrintWriter pw = new PrintWriter(file)){
			pw.println(buff);
		}catch(FileNotFoundException e) {
			System.out.println("Erro File Write");
		}

	}
}
