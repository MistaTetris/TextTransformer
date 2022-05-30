package textTransformator;

public class InverseTransformer extends TextTransformer{
	
	@Override
	public String transform(String text) {
		StringBuilder sb = new StringBuilder(text.toString());
		String str = new String(sb.reverse());
		return str;
	}
		
}
