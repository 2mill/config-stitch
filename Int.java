import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;


//Exceptions
import java.io.IOException;
public class Int {
	private String hostname;
	private ArrayList<String> interfaceList;
	// private HashMap<String, String> interfaceConfig;
	private String filename;
	public Int(File config) throws IOException {
		Scanner configScanner = new Scanner(config);
		while(configScanner.hasNextLine()) {
			String line = configScanner.nextLine();
			if (line.startsWith("hostname")) hostname = line;
			if (line.startsWith("interface")) interfaceList.add(line);
		}
	}

	public String getHostname() {
		return hostname;
	}
	public ArrayList<String> getInterfaceList() {
		return interfaceList;
	}



}
