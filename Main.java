package textTransformator;

public class Main {

	public static void main(String[] args) {
		String hello = new String("Hello World");
		TextTransformer tt = new UpDownTransformer();
		
		System.out.println(tt.transform(hello));
		tt = new InverseTransformer();
		System.out.println(tt.transform(hello));
		
		TextSaver ts = new TextSaver();
		
		ts.saveTextToFile(hello);
	}

}
