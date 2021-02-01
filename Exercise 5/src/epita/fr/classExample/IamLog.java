package epita.fr.classExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IamLog {
	
	public void log(String message) throws IOException {
		
		File file = new File("./test.log");


//		File file = new File("tmp/logs")
//		File parentFile = file.getParentFile();
//		parentFile.mkdirs();
//		file.createNewFile();
		
		boolean fileExists = file.exists();
		
		if(!fileExists)
			file.createNewFile();
		
		
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm:ss.SSS");
		

		FileWriter fr = new FileWriter(file,true);
		String lineSep = System.getProperty("line.separator");
		fr.append(LocalDateTime.now().format(format) + " : "+ message+lineSep);
		fr.close();
	}

}
