import static org.junit.Assert.*;

import org.junit.Test;

public class TestFileSystem {

	@Test
	public void test() {

		Folder root = new Folder(0, "/");
		Folder bin = new Folder(1, "bin/");
		Folder usr = new Folder(2, "usr/");
		Folder luke = new Folder(3, "luke/");
		File mynotes = new File(4, "mynotes");
		
		Folder docs = new Folder(5, "docs/");
		Folder dev = new Folder(6, "dev/");
		Folder java = new Folder(7, "java/");
		Folder c = new Folder(8, "C/");
		Folder www = new Folder(9, "www/");
		Folder google = new Folder(10, "google/");
		
		File googleIndex = new File(11, "index.html");
		File googleLogo = new File(12, "logo.png");
		File knowledgeIsland = new File(13, "knowledge-island.c");
		File ai = new File(14, "ai.c");
		
		root.addFile(bin);
		root.addFile(usr);
		usr.addFile(luke);

		luke.addFile(mynotes);
		luke.addFile(docs);
		luke.addFile(dev);
		dev.addFile(java);
		dev.addFile(c);
		luke.addFile(www);
		www.addFile(google);
		google.addFile(googleIndex);
		google.addFile(googleLogo);
		c.addFile(knowledgeIsland);
		c.addFile(ai);
		
		System.out.println(root.list(true));
	}

}
