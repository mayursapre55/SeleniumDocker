/**
 * 
 */
package docker.com.docker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

/**
 * @author gslab
 *
 */
public class StartDocker {

	@Test
	public void startDocker() throws IOException {
		
		//Linux/Mac
		Runtime runtime=Runtime.getRuntime();
		runtime.exec("sudo /home/gslab/Desktop/Files/com.docker && ./docker-up.sh");
		
		//Linux
		  Process p;
		  try {
		   String[] cmd = { "sh", "/home/gslab/Desktop/Files/com.docker/docker-up.sh"};
		   p = Runtime.getRuntime().exec(cmd); 
		   p.waitFor(); 
		   BufferedReader reader=new BufferedReader(new InputStreamReader(
		    p.getInputStream())); 
		   String line; 
		   while((line = reader.readLine()) != null) { 
		    System.out.println(line);
		   } 
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  } catch (InterruptedException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
	
		//Windows
//		Runtime runtime1=Runtime.getRuntime();
//		runtime1.exec("cmd /c start docker-up.bat");
	
	}
}
