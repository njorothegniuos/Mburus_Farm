package wavesolutions.co.ke.Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Utils {
	
		public void LogError(String module,Exception ex){
			 File file =new File("errorlog.txt");
		     try {
			   file.createNewFile();
		        FileWriter writer = new FileWriter(file);
		        // Writes the content to the file
		        writer.write(module+" :" + ex.toString()); 
		        writer.flush();
		        writer.close();
		     } catch (IOException e) {
					e.printStackTrace();
			}
		}
}


