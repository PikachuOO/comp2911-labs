
public class File implements IFile {
	
	private final int id;
	private final String filename;
	
	public File(int id, String filename) {
		this.id = id;
		this.filename = filename;
	}

	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getFilename() {
		return filename;
	}
	
	@Override
	public String toString() {
		return filename;
	}
}
