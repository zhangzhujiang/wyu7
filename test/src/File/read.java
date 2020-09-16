package File;
import java.io.File;
public class read {
   
	public static void main(String[] args) {
	File f=new File("C:\\app");

		if (f.isDirectory()) {
			File[] files=f.listFiles();
			for(File file2 : files) {
				System.out.println(file2.getName());
			}
		}
	}

	}


