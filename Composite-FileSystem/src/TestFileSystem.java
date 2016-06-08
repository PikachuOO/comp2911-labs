import static org.junit.Assert.*;

import org.junit.Test;

public class TestFileSystem {

	@Test
	public void test() {
		FileSystem fs = new Folder(0, "/");
		
		Folder bin = new Folder(1, "bin/");
		Folder usr = new Folder(2, "usr/");
		Folder luke = new Folder(3, "luke/");
		File mynotes = new File(4, "mynotes");
		
		fs.addFile(bin);
		fs.addFile(usr);
		usr.addFile(luke);
		luke.addFile(mynotes);

		assertEquals(fs.numFiles(), 0);
		assertEquals(fs.numFolders(), 2);
		assertEquals(bin.numFiles(), 0);
		assertEquals(bin.numFolders(), 0);
		assertEquals(usr.numFiles(), 0);
		assertEquals(usr.numFolders(), 1);
		assertEquals(luke.numFiles(), 1);
		assertEquals(luke.numFolders(), 0);
	}

}
