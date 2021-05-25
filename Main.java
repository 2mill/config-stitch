import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Iterator;
class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Tempalte file:");
		File template = new File("./"+sc.nextLine());
		System.out.print("Config File: ");
		File config = new File("./"+sc.nextLine());
		if (!(config.exists() && template.exists())) {
			System.err.println("Could not find either or both files");
		}
		Int temp = null;
		try {
			temp = new Int(template);
		} catch (IOException e) {
			System.err.println("Failed reading template configuration file:" + template);
			return;
		}


		/**
		 * TODO: ALL OF THIS SHIT NEEDS TO GO INTO newConfigIterator
		 */

		try {
			String build = new String();
			Scanner configScanner = new Scanner(config);
			ArrayList<String> newConfig = new ArrayList<String>();
			Iterator<String> iter = temp.getInterfaceList().iterator();
			while (configScanner.hasNextLine()) {
				String line = configScanner.nextLine();
				if (line.startsWith("hostname")) newConfig.add(line);
				else if (line.startsWith("interface")) newConfig.add(iter.next());
				else newConfig.add(line);
			}

		} catch (IOException e) {
			System.err.println("Could not read config file");
		}

		//Write to file

		//Generate new config
		File newFile = new File("_new.config");
		int inc = 0;
		while (newFile.exists()) {
			newFile = new File(inc + "_new.config");
		}

		FileWriter writer;
		try {
			newFile.createNewFile();
			writer = new FileWriter(newFile);
		} catch (IOException e) {
			System.err.println("Could not create new config file");
		}
		System.out.println("New config file: " + newFile);

		Iterator<String> configIterator = newConfigh


	}

	public static Iterator<String> newConfigIterator(File config, Int template) throws IOEXception {

	}
}


