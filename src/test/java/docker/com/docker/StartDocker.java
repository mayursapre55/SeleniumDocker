/**
 * 
 */
package docker.com.docker;

import java.io.IOException;

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
		runtime.exec("/home/gslab/Desktop/Files/com.docker && ./docker-up.sh");
	
		//Windows
		Runtime runtime1=Runtime.getRuntime();
		runtime1.exec("cmd /c start docker-up.bat");
	
	}
}
