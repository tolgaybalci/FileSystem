
public class DataFile extends BinaryFile{

	private String compressionFormat;
	private String openWith;
	private boolean bits[];

	public String getCompressionFormat() {
		return compressionFormat;
	}

	public void setCompressionFormat(String compressionFormat) {
		this.compressionFormat = compressionFormat;
	}

	public String getOpenWith() {
		return openWith;
	}

	public void setOpenWith(String openWith) {
		this.openWith = openWith;
	}

	public boolean[] getBits() {
		return bits;
	}

	public void setBits(boolean[] bits) {
		this.bits = bits;
	}

}
