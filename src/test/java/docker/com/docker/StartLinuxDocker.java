/**
 * 
 */
package docker.com.docker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * @author gslab
 *
 */
public class StartLinuxDocker {

	@Test
	public void startDockerForLinux() throws IOException, InterruptedException {
		boolean flag=false;
		StartDocker.startDockerFromLinux("sudo -S /home/gslab/Desktop/Files/com.docker/docker-up.sh");
		String file="/home/gslab/Desktop/Files/com.docker/output.txt";
		Calendar cal=Calendar.getInstance(); //2.44 15th Seconds
		cal.add(Calendar.SECOND,30); //Add 30 seconds to current time 2.44 45th Second
		long stopnow=cal.getTimeInMillis(); // ANd this added time is stored in stopnow
		while (System.currentTimeMillis()<stopnow) {
			{
				if(flag)
				{
					break;
				}
			}
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String line=reader.readLine();
		while(line!=null && !flag) {
			if(line.contains("Registering the node to the hub")) {
				System.out.println("Text Found");
				flag=true;
				break;
			}
		line=reader.readLine();
		}
		reader.close();
		}
		Assert.assertTrue(flag);
	}
	
	

	
}
