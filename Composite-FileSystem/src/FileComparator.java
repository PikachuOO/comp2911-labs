import java.util.Comparator;

public class FileComparator implements Comparator<IFile> {

	@Override
	public int compare(IFile o1, IFile o2) {
		return o1.getFilename().compareTo(o2.getFilename());
	}

}
