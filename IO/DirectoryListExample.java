package Week;

import java.io.File;

public class DirectoryListExample {
	public static void main(String[] args) {
		File directory = new File("C:\\Users\\rajesh\\eclipse-workspace\\Puppy\\src");
		get(directory);
	}

	public static void get(File directory) {
		try {
			if (directory.isDirectory()) {
				System.out.println("Contents of the directory:");
				System.out.println("--------------------------");
				String[] contents = directory.list();
				for (String content : contents) {
					File this_content = new File(directory, content);
					if (this_content.isDirectory()) {
						System.out.println("DIRECTORY - " + content);
					} else {
						System.out.println("FILE - " + content);
					}
				}
				File[] files = directory.listFiles();
				for (File file : files) {
					if (file.isDirectory()) {
						System.out.println("\n\nDirectory: " + file.getName());
						System.out.println("--------------------------");
						File directory2 = new File(directory + "\\" + file.getName());
						get(directory2);
					}
				}
			} else {
				System.out.println("Not a directory. - " + directory);
			}
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}
