/**
 * 
 */
package docker.com.docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author gslab
 *
 */
public class DockerFirefox {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver drivre=new RemoteWebDriver(url,cap);
		drivre.get("http://www.google.com");
		System.out.println(drivre.getTitle());
	}
}
