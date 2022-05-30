package textTransformator;

public class UpDownTransformer extends TextTransformer {

	@Override
	public String transform(String text) {
		StringBuilder sb = new StringBuilder(text);
		for (int i = 0; i < sb.length(); i++) {
			if (i % 2 == 0) {
				char ch = sb.charAt(i);
				ch = Character.toUpperCase(ch);
				sb.setCharAt(i, ch);
			}else {
				char ch = sb.charAt(i);
				ch = Character.toLowerCase(ch);
				sb.setCharAt(i, ch);
			}
		}
		String str = sb.toString();
		return str;
	}

}
