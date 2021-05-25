import java.io.File;
import java.io.Writer;
import java.util.Scanner;
import java.util.ArrayList;
class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Base file:");
		File template = new File("./"+sc.nextLine());
		System.out.print("Target: ");
		File config = new File("./"+sc.nextLine());
		if (!(config.exists() && template.exists())) {
			System.err.println("Could not find either or both files");
		}

		Scanner templateRead= null;
		Scanner configRead = null;
		ArrayList<String> targetLines = new ArrayList<>();

		try {
			templateRead = new Scanner(template);
			configRead = new Scanner(config);
		} catch (Exception e) {
			System.err.print("Could not read one or both files");
			return;
		}
		String output = new String();

		while (configRead.hasNextLine()) {
			String line = configRead.nextLine();

			if (line.startsWith("interface")) {
				System.out.println(line);
				while (!line.equals("!")) {
					line = configRead.nextLine();
					System.out.println(line);
				}
			}
		}


		//Switch to check if we are reading from configRead or not.


	}


}
