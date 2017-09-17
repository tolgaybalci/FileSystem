
public abstract class File {

	private String name;
	private int size;
	private String dateCreated;
     
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDateCreated() {
		return dateCreated;
	}

   	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void onClick() {
		
		System.out.println("Tuşa basıldı.");
	}
}
