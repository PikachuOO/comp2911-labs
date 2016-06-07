
public interface FileSystem {

	public boolean addFile(FileSystem file);
	public boolean removeFile(FileSystem file);
	public int numFiles();
	public int numFolders();
	public int getId();
	public String getFilename();
}
