import java.util.ArrayList;

public class Folder implements FileSystem {

	private final int id;
	private final String fileName;
	private ArrayList<FileSystem> files;
	
	public Folder(int id, String fileName) {
		this.id = id;
		this.fileName = fileName;
		this.files = new ArrayList<FileSystem>();
	}

	@Override
	public boolean addFile(FileSystem file) {
		if (fileExists(file, false)) {
			return false;
		}

		files.add(file);
		return true;
	}

	@Override
	public boolean removeFile(FileSystem file) {
		if (fileExists(file, false)) {
			files.remove(file);
		}
		return false;
	}

	@Override
	public int numFiles() {
		int result = 0;

		for (FileSystem considerFile : files) {
			if (considerFile instanceof File) {
				result += 1;
			}
		}
		return result;
	}

	@Override
	public int numFolders() {
		int result = 0;
		
		for (FileSystem considerFile : files) {
			if (considerFile instanceof Folder) {
				result += 1;
			}
		}
		
		return result;
	}

	public boolean fileExists(FileSystem file, boolean recurse) {
		for (FileSystem considerFile : files) {
			if (file == considerFile) {
				return true;

			} else if (considerFile instanceof Folder && recurse == true) {
				if (((Folder) considerFile).fileExists(file, true)) {
					return true;
				}
			}
		}
		
		return false;
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
