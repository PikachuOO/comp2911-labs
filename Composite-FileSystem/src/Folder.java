import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Folder extends File {

	private ArrayList<IFile> files;
	
	public Folder(int id, String filename) {
		super(id, filename);
		this.files = new ArrayList<IFile>();
	}

	public boolean addFile(IFile file) {
		if (fileExists(file, false)) {
			return false;
		}

		files.add(file);
		return true;
	}

	public boolean removeFile(IFile file) {
		if (fileExists(file, false)) {
			files.remove(file);
		}
		return false;
	}


	public boolean fileExists(IFile file, boolean recurse) {
		for (IFile considerFile : files) {
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
	
	public String list(boolean isRoot) {
		String result;
		Comparator comparator = new FileComparator();
		Collections.sort(files, comparator);
		
		if (isRoot) {
			result = super.getFilename();
		} else {
			result = "";
		}

		for (IFile file : files) {
			if (file instanceof Folder) {
				result = result.concat("\t\n" + file.getFilename());
//				result = result.concat("\t\t" + ((Folder) file).list(false));
				String newls = ((Folder) file).list(false);
				newls = newls.replaceAll("\n", "\n   ");
				result = result.concat(newls);
			} else {
				result = result.concat("\n" + file.getFilename());
			}
		}
		
		return result;
	}

//	public int compareTo(IFile a) {
//		if (this.getFilename().compareTo(a.getFilename()) {
//			return 1;
//		} if (this.getFilename().equals(a.getFilename()) {
//			return 0;
//		}
//		return -1;
//	}
}
