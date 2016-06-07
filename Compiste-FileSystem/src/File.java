
public class File implements FileSystem {
	
	private final int id;
	private final String fileName;
	
	public File(int id, String fileName) {
		this.id = id;
		this.fileName = fileName;
	}

	@Override
	public boolean addFile(FileSystem file) {
		return false;
	}

	@Override
	public boolean removeFile(FileSystem file) {
		return false;
	}

	@Override
	public int numFiles() {
		return 0;
	}

	@Override
	public int numFolders() {
		return 0;
	}

	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getFilename() {
		return fileName;
	}
}
