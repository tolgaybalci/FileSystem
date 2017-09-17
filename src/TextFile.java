
public class TextFile extends File implements Openable {

	private String encoding;
	private char[] numOfChar;

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public char[] getNumOfChar() {
		return numOfChar;
	}

	public void setNumOfChar(char[] numOfChar) {
		this.numOfChar = numOfChar;
	}

	public void open() {
		
		System.out.println("Dosyayı aç");
	}
}
