package strings;

public class Essay {
	private String name;
	private String text;
	public Essay() {
		name = "Bob Smith";
		text = "Hello World";
	}
	public void setName(String xName) {
		name = xName;
	}
	public void setText(String xText) {
		text = xText;
	}
	public String lastname() {
		String last = name.substring(name.indexOf(" ")+1);
		return last.toUpperCase();
	}
	public int firstname() {
		String first = name.substring(0,name.indexOf(" "));
		return first.length();
	}
	public boolean findletter() {
		return name.toLowerCase().contains("x");
	}
	public int words() {
		//Assumes theres at least 1 word
		int words = 1;
		for (int j = 0;j<text.length();j++) {
			if (text.charAt(j)==' ') {
				words++;
			}
		}return words;
	}
}
